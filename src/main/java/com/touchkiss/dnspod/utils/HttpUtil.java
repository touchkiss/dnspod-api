package com.touchkiss.dnspod.utils;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.SocketConfig;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created on 2020/03/31 9:48
 *
 * @author Touchkiss
 */
public class HttpUtil {
    public final static int DEFAULT_CONNECT_TIMEOUT = 10 * 1000;
    public final static int DEFAULT_SOCKET_TIMEOUT = 10 * 1000;
    public final static String DEFAULT_CHARSET = "utf-8";
    public final static SocketConfig DEFAULT_SOCKET_CONFIG = SocketConfig.custom()
            .setSoKeepAlive(false)
            .setSoLinger(1)
            .setSoReuseAddress(true)
            .setSoTimeout(DEFAULT_SOCKET_TIMEOUT)
            .setTcpNoDelay(true)
            .build();

    private static CloseableHttpClient getHttpClient() {
        return HttpClients.custom()
                .setConnectionTimeToLive(DEFAULT_CONNECT_TIMEOUT, TimeUnit.MILLISECONDS)
                .setDefaultSocketConfig(DEFAULT_SOCKET_CONFIG)
                .build();
    }

    public static String get(String url) throws IOException {
        return get(url, DEFAULT_CONNECT_TIMEOUT, DEFAULT_SOCKET_TIMEOUT, DEFAULT_CHARSET, null);
    }

    public static String get(String url, int connectTimeout, int socketTimeout, String charset, List<Header> headers) throws IOException {
        HttpGet httpget = new HttpGet(url);
        configAndHeaders(connectTimeout, socketTimeout, headers, httpget);
        return response(charset, getHttpClient().execute(httpget));
    }

    private static String response(String charset, CloseableHttpResponse response) throws IOException {
        HttpEntity httpEntity = response.getEntity();
        return inputStream2String(httpEntity.getContent(), charset);
    }

    public static String post(String url) throws IOException {
        return post(url, "");
    }

    public static String post(String url, String body) throws IOException {
        return post(url, body, null);
    }

    public static String post(String url, Map params) throws IOException {
        return post(url, params, null);
    }

    public static String post(String url, String body, List<Header> headers) throws IOException {
        return post(url, DEFAULT_CONNECT_TIMEOUT, DEFAULT_SOCKET_TIMEOUT, DEFAULT_CHARSET, body, headers);
    }

    public static String post(String url, Map params, List<Header> headers) throws IOException {
        return post(url, DEFAULT_CONNECT_TIMEOUT, DEFAULT_SOCKET_TIMEOUT, DEFAULT_CHARSET, params, headers);
    }

    public static String post(String url, int connectTimeout, int socketTimeout, String charset, Map params, List<Header> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        if (params != null && params.size() > 0) {
            List<NameValuePair> pairs = new ArrayList<>();
            params.forEach((key, value) -> pairs.add(new BasicNameValuePair(key.toString(), value.toString())));
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(pairs, charset);
            httpPost.setEntity(formEntity);
        }
        configAndHeaders(connectTimeout, socketTimeout, headers, httpPost);
        return response(charset, getHttpClient().execute(httpPost));
    }

    private static void configAndHeaders(int connectTimeout, int socketTimeout, List<Header> headers, HttpRequestBase request) {
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(connectTimeout)
                .setSocketTimeout(socketTimeout).build();
        request.setConfig(requestConfig);
        if (headers != null && headers.size() > 0) {
            headers.forEach(request::addHeader);
        }
    }

    public static String post(String url, int connectTimeout, int socketTimeout, String charset, String body, List<Header> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(body, Charset.forName(charset)));
        configAndHeaders(connectTimeout, socketTimeout, headers, httpPost);
        return response(charset, getHttpClient().execute(httpPost));
    }

    public static String inputStream2String(InputStream in, String charset) throws IOException {
        StringBuilder out = new StringBuilder();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1; ) {
            out.append(new String(b, 0, n, charset));
        }
        return out.toString();
    }
}
