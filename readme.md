#Dnspod Api

##使用方式

### 1.获取DnspodClient
DnspodClient client = DnspodClient.getClient("token,tokentokentokentokentokentoken");
### 2.创建请求体
UserDetailRequest request = new UserDetailRequest();
### 3.获得结果
UserDetailResponse userDetailResponse = client.doAction(request);

##现已支持官方所有用户api，点击查看<a href="https://www.dnspod.cn/docs/index.html">官方文档</a>
