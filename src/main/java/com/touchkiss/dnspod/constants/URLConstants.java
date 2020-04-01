package com.touchkiss.dnspod.constants;

import com.touchkiss.dnspod.BaseClient;
import org.apache.http.client.methods.HttpPost;

/**
 * Created on 2020/03/31 9:48
 *
 * @author Touchkiss
 */
public enum URLConstants {
    /**
     * 接口地址：
     * https://dnsapi.cn/Info.Version
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * 响应代码：
     * 共通返回
     */
    INFO_VERSION(HttpPost.METHOD_NAME, "https://dnsapi.cn/Info.Version", "获取API版本号"),
    /**
     * 接口地址：
     * https://dnsapi.cn/User.Detail
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * 响应代码：
     * 共通返回
     */
    USER_DETAIL(HttpPost.METHOD_NAME,"https://dnsapi.cn/User.Detail","获取帐户信息"),
    /**
     * 接口地址：
     * https://dnsapi.cn/User.Log
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * 响应代码：
     * 共通返回
     */
    USER_LOG(HttpPost.METHOD_NAME,"https://dnsapi.cn/User.Log","获取用户日志"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Create
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain	是	域名, 没有 www, 如 dnspod.com
     * group_id	否	域名分组ID, 可选参数
     * is_mark	否	是否星标域名，”yes”、”no” 分别代表是和否
     * 响应代码：
     * 共通返回
     * 6 域名无效
     * 7 域名已存在
     * 11 域名已经存在并且是其它域名的别名
     * 12 域名已经存在并且您没有权限管理
     */
    DOMAIN_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Create","添加新域名"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.List
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * type	否
     * 域名分组类型, 默认为’all’. 包含以下类型：
     * all：所有域名
     * mine：我的域名
     * share：共享给我的域名
     * ismark：星标域名
     * pause：暂停域名
     * vip：VIP域名
     * recent：最近操作过的域名
     * share_out：我共享出去的域名
     * offset	否	记录开始的偏移, 第一条记录为 0, 依次类推
     * length	否	要获取的域名数量, 比如获取20个, 则为20
     * group_id	否	分组ID, 获取指定分组的域名。可以通过 获取域名分组 获取 group_id
     * keyword	否	搜索的关键字, 如果指定则只返回符合该关键字的域名
     * 注意事项：
     * 如果账户中的域名数量超过了3000, 将会强制分页并且只返回前3000条, 这时需要通过 offset 和 length 参数去获取其它域名.
     * 响应代码：
     * 共通返回
     * 6 记录开始的偏移无效
     * 7 共要获取的记录的数量无效
     * 9 没有任何域名
     */
    DOMAIN_LIST(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.List","获取域名列表"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Remove
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效、VIP域名不可以删除
     * 13 当前域名有误，请返回重新操作
     * 21 域名已锁定
     */
    DOMAIN_REMOVE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Remove","删除域名"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Status
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * status	是	域名状态，”enable” 、”disable” 分别代表启用和暂停
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 域名被锁定
     * 8 非域名所有者
     * 13 当前域名有误，请返回重新操作
     * 21 域名被锁定
     */
    DOMAIN_STATUS(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Status","设置域名状态"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Info
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 非域名所有者
     * 13 当前域名有误，请返回重新操作
     */
    DOMAIN_INFO(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Info","获取域名信息"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Log
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * offset	否	记录开始的偏移，第一条记录为 0，依次类推，默认为0
     * length	否	共要获取的日志条数，比如获取20条，则为20，默认为500条，单次最多获取500条
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     */
    DOMAIN_LOG(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Log","获取域名日志"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Searchenginepush
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * status	是	是否推送，”yes”、”no” 分别代表开启和关闭
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     * 21 域名被锁定
     */
    DOMAIN_SEARCHENGINEPUSH(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Searchenginepush","设置搜索引擎推送"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domainshare.Create
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * email	是	要共享到的邮箱
     * mode	否	共享模式，”r”、”rw” 分别代表只读和读取、修改, 默认为 r
     * sub_domain	否	子域名共享, 如：www、bbs等. 如果要共享整个域名, 则无需提交此参数
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名id无效
     * 10 已达到该域名的最大共享限制
     * 13 当前域名有误，请返回重新操作
     * 21 域名被锁定
     * 23 子域名级数超出限制
     * 24 泛解析级数超出限制
     * 75 子域名共享数量超出了限制
     */
    DOMAIN_SHARE_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domainshare.Create","添加域名共享"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domainshare.List
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效、VIP域名不可以删除
     * 13 当前域名有误，请返回重新操作
     */
    DOMAIN_SHARE_LIST(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domainshare.List","域名共享列表"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domainshare.Modify
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * email	是	被共享者的邮箱, 原来是什么就提交什么, 不能修改
     * mode	否	共享模式，”r”、”rw” 分别代表只读和读取、修改, 默认为 r
     * sub_domain	否	子域名共享, 如：www、bbs等. 如果要共享整个域名, 则无需提交此参数
     * old_sub_domain	否	已经成功共享的子域名, 如果只修改主域名共享, 则无需提交此参数
     * new_sub_domain	否	要修改到的共享子域名
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名id无效
     * 13 当前域名有误，请返回重新操作
     * 21 域名被锁定
     * 23 子域名级数超出限制
     * 24 泛解析级数超出限制
     */
    DOMAIN_SHARE_MODIFY(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domainshare.Modify","修改域名共享"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Domainshare.Remove
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * email	是	被共享者的邮箱, 原来是什么就提交什么, 不能修改
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名id无效
     * 13 当前域名有误，请返回重新操作
     * 21 域名被锁定
     */
    DOMAIN_SHARE_REMOVE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domainshare.Remove","删除域名共享"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Transfer
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * email	是	域名将要过户到的邮箱帐号
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名id无效
     * 13 当前域名有误，请返回重新操作
     * 21 域名被锁定
     * 9 域名已在账号名下
     * 103 email输入不正确
     * 1008 用户不存在
     */
    DOMAIN_TRANSFER(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Transfer","域名过户"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Lock
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * days	是	域名要锁定的天数，最多可锁定的天数可以通过 获取域名权限 接口获取
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 8 锁定天数错误
     * 13 当前域名有误，请返回重新操作
     * 21 域名已经被锁定
     */
    DOMAIN_LOCK(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Lock","锁定域名"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Unlock
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * lock_code	是	域名解锁码, 锁定的时候会返回
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 9 解锁代码不正确
     * 13 当前域名有误，请返回重新操作
     * 21 域名已经被锁定
     */
    DOMAIN_UNLOCK(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Unlock","域名锁定解锁"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domainalias.List
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     */
    DOMAIN_ALIAS_LIST(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domainalias.List","域名绑定列表"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domainalias.Create
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id	是	要创建别名绑定的域名ID
     * domain	是	要绑定到的域名，不带 www，例如：dnspod.com
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 8 域名已存在
     * 9 别名已存在
     * 10 别名数量已经达到限制
     * 13 当前域名有误，请返回重新操作/li>
     * 21 域名被锁定
     */
    DOMAIN_ALIAS_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domainalias.Create","添加域名绑定"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domainalias.Remove
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * alias_id	是	别名绑定的ID, 绑定域名的时候会返回
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者、域名别名编号错误
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     * 21 域名被锁定
     */
    DOMAIN_ALIAS_REMOVE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domainalias.Remove","删除域名绑定"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domaingroup.List
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * 响应代码：
     * 共通返回
     */
    DOMAIN_GROUP_LIST(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domaingroup.List","获取域名分组"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domaingroup.Create
     * 该接口只对VIP帐户有效, 免费用户无法获取域名分组, 免费用户会返回错误提示.
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * group_name	是	分组名称
     * 响应代码：
     * 共通返回
     * 7 分组名称错误
     * 8 分组名称已经存在
     * 9 分组数量超出限制
     */
    DOMAIN_GROUP_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domaingroup.Create","添加域名分组"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domaingroup.Modify
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * group_id	是	要修改的分组ID
     * group_name	是	需要修改到的分组名称
     * 响应代码：
     * 共通返回
     * 6 分组ID错误
     * 7 分组名称错误
     * 8 分组名称已经存在
     * 9 分组数量超出限制
     */
    DOMAIN_GROUP_MODIFY(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domaingroup.Modify","修改域名分组"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domaingroup.Remove
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * group_id	是	要删除的分组ID
     * 响应代码：
     * 共通返回
     * 6 分组ID错误
     */
    DOMAIN_GROUP_REMOVE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domaingroup.Remove","删除域名分组"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Changegroup
     * 说明：
     *
     * 其它用户共享过来的域名全在“与我共享”系统分组下, 不能更改
     * 只有域名所有者可以更改域名的分组, 被共享者不能更改
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * group_id	是	分组ID
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者、分组id不正确
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     */
    DOMAIN_CHANFGE_GROUP(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Changegroup","设置域名分组"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Ismark
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * is_mark	是	是否星标域名，”yes”、”no” 分别代表是和否
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     * 21 域名已锁定
     */
    DOMAIN_ISMARK(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Ismark","设置域名星标"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Remark
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * remark	是	域名备注, 删除备注请提交空内容
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     */
    DOMAIN_REMARK(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Remark","设置域名备注"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Domain.Purview
     * 说明：
     * 获取成功后要在本地保存一份, 不要操作一次获取一次
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 9 备注过长
     * 13 当前域名有误，请返回重新操作
     * 21 域名已锁定
     */
    DOMAIN_PURVIEW(HttpPost.METHOD_NAME,"https://dnsapi.cn/Domain.Purview","获取域名权限"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Type
     *  说明：
     * 如果域名等级没有变更，则每次返回的允许的记录类型都是一致的，建议获取成功后在本地保存一份, 不要用一次就请求一次
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_grade	是
     * 域名等级, 分别为：
     * 旧套餐：D_Free、D_Plus、D_Extra、D_Expert、D_Ultra 分别对应免费套餐、个人豪华、企业1、企业2、企业3
     * 新套餐：DP_Free、DP_Plus、DP_Extra、DP_Expert、DP_Ultra 分别对应新免费、个人专业版、企业创业版、企业标准版、企业旗舰版
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     */
    RECORD_TYPE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Type","获取等级允许的记录类型"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Line
     *  说明：
     * 如果域名等级没有变更，则每次返回的允许的线路都是一致的，建议获取成功后在本地保存一份, 不要用一次就请求一次
     * line_ids 为新增的返回字段，对应关系为: 中文线路名称：线路ID，支持在创建、修改解析记录的时候传入线路ID，解决之前部分开发者存在的中文编码问题
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 参数名	是否必须	参数描述
     * 公共参数	是	详见：公共参数
     * domain_id 或 domain	是	分别对应域名ID和域名, 提交其中一个即可
     * domain_grade	是
     * 域名等级, 分别为：
     * 旧套餐：D_Free、D_Plus、D_Extra、D_Expert、D_Ultra 分别对应免费套餐、个人豪华、企业1、企业2、企业3
     * 新套餐：DP_Free、DP_Plus、DP_Extra、DP_Expert、DP_Ultra 分别对应新免费、个人专业版、企业创业版、企业标准版、企业旗舰版
     * 响应代码：
     * 共通返回
     * 共通返回
     * 6 域名ID错误、域名等级错误
     * 7 非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     */
    RECORD_LINE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Line","获取等级允许的线路"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Record.Create
     * 注意：
     * record_line_id 形如 “10=3”，其中可能会包含等号，即 “=”，如果是通过类似 URL 传递参数，需要将 ‘=’ 转义成 ‘%3D’
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 域名ID, 必选
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * sub_domain 主机记录, 如 www，可选，如果不传，默认为 @
     * record_type 记录类型，通过API记录类型获得，大写英文，比如：A, 必选
     * record_line 记录线路，通过API记录线路获得，中文，比如：默认
     * record_line_id 线路的ID，通过API记录线路获得，英文字符串，比如：‘10=1’ 【record_line 和 record_line_id 二者传其一即可，系统优先取 record_line_id】
     * value 记录值, 如 IP:200.200.200.200, CNAME: cname.dnspod.com., MX: mail.dnspod.com., 必选
     * mx {1-20} MX优先级, 当记录类型是 MX 时有效，范围1-20, MX记录必选
     * ttl {1-604800} TTL，范围1-604800，不同等级域名最小值不同, 可选
     * status [“enable”, “disable”]，记录初始状态，默认为”enable”，如果传入”disable”，解析不会生效，也不会验证负载均衡的限制，可选
     * weight 权重信息，0到100的整数，可选。仅企业 VIP 域名可用，0 表示关闭，留空或者不传该参数，表示不设置权重信息
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 17 记录的值不正确
     * 21 域名被锁定
     * 22 子域名不合法
     * 23 子域名级数超出限制
     * 24 泛解析子域名错误
     * 500025 A记录负载均衡超出限制
     * 500026 CNAME记录负载均衡超出限制
     * 26 记录线路错误
     * 27 记录类型错误
     * 30 MX 值错误，1-20
     * 31 没有添加默认线路的记录、存在冲突的记录(A记录、CNAME记录、URL记录不能共存)
     * 32 记录的TTL值超出了限制、NS记录超出限制
     * 33 AAAA 记录数超出限制
     * 34 记录值非法
     * 37 SRV记录超出限制
     * 82 不能添加黑名单中的IP
     * 104 记录已存在无需添加
     * 110 域名没有备案（显性URL和隐形URL类型）
     */
    RECORD_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Create","添加记录"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Record.List
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * offset 记录开始的偏移，第一条记录为 0，依次类推，可选（仅当指定 length 参数时才生效）
     * length 共要获取的记录数量的最大值，比如最多获取20条，则为20，最大3000.可选
     * sub_domain 子域名，如果指定则只返回此子域名的记录，可选
     * record_type 记录类型，通过API记录类型获得，大写英文，比如：A，可选
     * record_line 记录线路，通过API记录线路获得，中文，比如：默认，可选
     * record_line_id 线路的ID，通过API记录线路获得，英文字符串，比如：‘10=1’，可选 【需要获取特定线路的解析记录时，record_line 和 record_line_id 二者传其一即可，系统优先取 record_line_id】
     * keyword，搜索的关键字，如果指定则只返回符合该关键字的记录，可选 【指定 keyword 后系统忽略查询参数 sub_domain，record_type，record_line，record_line_id】
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     * 7 记录开始的偏移无效、非域名所有者
     * 8 共要获取的记录的数量无效、域名无效
     * 13 当前域名有误，请返回重新操作
     * 27 线路无效
     * 注意事项：
     * 如果域名的记录数量超过了100，将会强制分页并且只返回前100条，这时需要通过 offset 和 length 参数去获取其它记录。
     */
    RECORD_LIST(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.List","记录列表"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Modify
     *  注意：
     * record_line_id 形如 “10=3”，其中可能会包含等号，即 “=”，如果是通过类似 URL 传递参数，需要将 ‘=’ 转义成 ‘%3D’
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * record_id 记录ID，必选
     * sub_domain 主机记录, 如 www，可选，如果不传，默认为 @
     * record_type 记录类型，通过API记录类型获得，大写英文，比如：A，必选
     * record_line 记录线路，通过API记录线路获得，中文，比如：默认，必选
     * record_line_id 线路的ID，通过API记录线路获得，英文字符串，比如：‘10=1’ 【record_line 和 record_line_id 二者传其一即可，系统优先取 record_line_id】
     * value 记录值, 如 IP:200.200.200.200, CNAME: cname.dnspod.com., MX: mail.dnspod.com.，必选
     * mx {1-20} MX优先级, 当记录类型是 MX 时有效，范围1-20, mx记录必选
     * ttl {1-604800} TTL，范围1-604800，不同等级域名最小值不同，可选
     * status [“enable”, “disable”]，记录状态，默认为”enable”，如果传入”disable”，解析不会生效，也不会验证负载均衡的限制，可选
     * weight 权重信息，0到100的整数，可选。仅企业 VIP 域名可用，0 表示关闭，留空或者不传该参数，表示不设置权重信息
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 17 记录的值不正确
     * 21 域名被锁定
     * 22 子域名不合法
     * 23 子域名级数超出限制
     * 24 泛解析子域名错误
     * 500025 A记录负载均衡超出限制
     * 500026 CNAME记录负载均衡超出限制
     * 26 记录线路错误
     * 27 记录类型错误
     * 30 MX 值错误，1-20
     * 31 没有添加默认线路的记录、存在冲突的记录(A记录、CNAME记录、URL记录不能共存)
     * 32 记录的TTL值超出了限制、NS记录超出限制
     * 33 AAAA 记录数超出限制
     * 34 记录值非法
     * 37 SRV记录超出限制
     * 41 URL的内容不符合DNSPod解析服务条款
     * 82 不能添加黑名单中的IP
     * 104 修改的记录已存在
     * 110 域名没有备案（显性URL和隐形URL类型）
     * 注意事项：
     * 如果1小时之内，提交了超过5次没有任何变动的记录修改请求，该记录会被系统锁定1小时，不允许再次修改。比如原记录值已经是 1.1.1.1，新的请求还要求修改为 1.1.1.1。
     */
    RECORD_MODIFY(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Modify","修改记录"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Remove
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * record_id 记录ID，必选
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     * 17 记录的值不正确
     * 21 域名被锁定
     */
    RECORD_REMOVE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Remove","删除记录"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Ddns
     *  注意：
     * record_line_id 形如 “10=3”，其中可能会包含等号，即 “=”，如果是通过类似 URL 传递参数，需要将 ‘=’ 转义成 ‘%3D’
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * record_id 记录ID，必选
     * sub_domain 主机记录，如 www
     * record_line 记录线路，通过API记录线路获得，中文，比如：默认，必选
     * record_line_id 线路的ID，通过API记录线路获得，英文字符串，比如：‘10=1’ 【record_line 和 record_line_id 二者传其一即可，系统优先取 record_line_id】
     * value IP地址，例如：6.6.6.6，可选
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 17 记录的值不正确
     * 21 域名被锁定
     * 22 子域名不合法
     * 23 子域名级数超出限制
     * 24 泛解析子域名错误
     * 500025 A记录负载均衡超出限制
     * 500026 CNAME记录负载均衡超出限制
     * 26 记录线路错误
     * 注意事项：
     * 如果1小时之内，提交了超过5次没有任何变动的记录修改请求，该记录会被系统锁定1小时，不允许再次修改，所以在开发和测试的过程中，请自行处理IP变动，仅在本地IP发生变动的情况下才调用本接口。
     * 如何理解没有任何变动的记录修改请求？比如原记录值已经是 1.1.1.1，新的请求还要求修改为 1.1.1.1。
     */
    RECORD_DDNS(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Ddns","更新动态DNS记录"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Remark
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * record_id 记录ID，必选
     * remark 域名备注，删除备注请提交空内容，必选
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     * 7 记录开始的偏移无效、非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     */
    RECORD_REMARK(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Remark","设置记录备注"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Info
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * record_id 记录ID，必选
     * 响应代码：
     * 共通返回
     * 6 域名ID错误
     * 7 记录开始的偏移无效、非域名所有者
     * 8 域名无效
     * 13 当前域名有误，请返回重新操作
     */
    RECORD_INFO(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Info","获取记录信息"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Record.Status
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain_id 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     * record_id 记录ID，必选
     * status {enable|disable} 新的状态，必选
     * 响应代码：
     * 共通返回
     * -15 域名已被封禁
     * 6 域名ID错误
     * 7 非域名所有者
     * 8 域名无效
     * 17 记录的值不正确
     * 21 域名被锁定
     * 22 子域名不合法
     * 23 子域名级数超出限制
     * 24 泛解析子域名错误
     * 500025 A记录负载均衡超出限制
     * 500026 CNAME记录负载均衡超出限制
     * 31 没有添加默认线路的记录、存在冲突的记录(A记录、CNAME记录、URL记录不能共存)
     * 33 AAAA 记录数超出限制
     * 37 SRV记录超出限制
     * 41 URL的内容不符合DNSPod解析服务条款
     * 82 不能添加黑名单中的IP
     * 110 域名没有备案（显性URL和隐形URL类型）
     */
    RECORD_STATUS(HttpPost.METHOD_NAME,"https://dnsapi.cn/Record.Status","设置记录状态"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Batch.Domain.Create
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domains 多个域名之间以英文的逗号分割
     * record_value 为每个域名添加 @ 和 www 的 A 记录值，记录值为IP，可选，如果不传此参数或者传空，将只添加域名，不添加记录
     * 响应代码：
     * 共通返回【具体错误信息参见 message 字段】
     */
    BATCH_DOMAIN_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Batch.Domain.Create","批量添加域名"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Batch.Record.Create
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     *
     * domain_id 域名ID，多个 domain_id 用英文逗号进行分割
     *
     * records 待批量添加的记录详情，JSON 字符串。形如：
     * [{“sub_domain”:”www,wap,bbs”,”record_type”:”A”,”record_line”:”默认”,”value”:”11.22.33.44”,”ttl”:600}]
     * [{“sub_domain”:”www,wap,bbs”,”record_type”:”A”,”record_line”:”默认”,”value”:”11.22.33.44”,”ttl”:600},{“sub_domain”:””,”record_type”:”MX”,”record_line”:”默认”,”value”:”mx.qq.com”,”ttl”:600,”MX”:10}]
     * 响应代码：
     * 共通返回【具体错误信息参见 message 字段】
     */
    BATCH_RECORD_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Batch.Record.Create","批量添加记录"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Batch.Detail
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * job_id 任务ID
     * 响应代码：
     * 共通返回
     * 8 数据为空，没有查到该任务
     */
    BATCH_DETAIL(HttpPost.METHOD_NAME,"https://dnsapi.cn/Batch.Detail","获取任务详情"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Batch.Record.Modify
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * record_id 记录的ID，多个 record_id 用英文的逗号分割
     * change 要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个
     * change_to 修改为，具体依赖 change 字段，必填参数
     * value 要修改到的记录值，可选，仅当 change 字段为 “record_type” 时为必填参数
     * mx MX记录优先级，可选，仅当修改为 MX 记录时为必填参数
     * 响应代码：
     * 共通返回【具体错误信息参见 message 字段】
     */
    BATCH_RECORD_MODIFY(HttpPost.METHOD_NAME,"https://dnsapi.cn/Batch.Record.Modify","批量修改记录"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Listsubdomain
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain或domain_id, 必选
     * 响应代码：
     * 共通返回
     * 6 当前域名有误，请返回重新操作
     * 7 域名编号错误
     * 8 此域名没有任何记录
     */
    MONITOR_LIST_SUBDOMAIN(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Listsubdomain","列出包含A记录的子域名"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Listsubvalue
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * domain或domain_id, 必选
     * subdomain 子域名，必选
     * 响应代码：
     * 共通返回
     * 6 当前域名有误，请返回重新操作
     * 7 域名编号错误
     */
    MONITOR_LIST_SUBVALUE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Listsubvalue","列出子域名的A记录"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.List
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * 响应代码：
     * 共通返回
     */
    MONITOR_LIST(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.List","监控列表"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Create
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     *
     * domain_id 域名编号，必选
     *
     * record_id 记录编号，必选
     *
     * port 监控端口，比如80，必选
     *
     * monitor_interval 监控间隔，支持{60|180|360|}，必选
     *
     * host 监控主机头，比如 www.dnspod.cn，必选
     *
     * monitor_type 监控类型，支持{http|https|cname|url}，必选
     *
     * monitor_path 监控路径，比如/，必选
     *
     * points 监控节点，用,分隔多个，只能选择列表中的节点，并且有数量限制，必选。支持的节点有（ctc: 上海电信, cuc: 深圳联通, ctc-2: 深圳电信, cuc-2: 上海联通, cmc-2: 深圳移动, ctc-3: 成都电信, cuc-4: 天津联通, cmc-4: 天津移动）
     *
     * bak_ip 宕机备用，必选，支持任选以下选项中的一个：
     * pass 只监控，不切换
     * pause 老版智能暂停功能，详见https://support.dnspod.cn/Kb/showarticle/tsid/179
     * pause2 智能暂停v2, 发现ip宕机后直接暂停该记录，无其它规则
     * auto 智能切换
     * 用逗号分隔的IP 设置备用IP
     * keep_ttl {yes|no} 宕机切换后是否修改ttl，可选，默认为 no
     *
     * sms_notice 短信通知，me域名所有者，share共享用户，用,分隔多选择，比如me,share, 可选
     *
     * email_notice 邮件通知，me域名所有者，share共享用户，用,分隔多选择，比如me,share，可选
     *
     * less_notice {yes|no}是否一个小时内只发一次通知，可选
     *
     * callback_url 可选，回调URL，宕机了会将相关的参数提交到此设置的URL，具体参考回调URL说明，可选
     *
     * callback_key 可选，回调密钥，如果设置了回调URL请设置此参数以保证安全，可选
     *
     * 响应代码：
     * 共通返回
     * 6 域名编号错误
     * 7 记录编号错误
     * 8 监控主机头错误
     * 9 监控端口错误，端口只能是正整数1~65535
     * 10 监控类型不正确
     * 11 监控路径不正确
     * 12 监控间隔不正确
     * 13 监控节点不正确
     * 14 监控节点数量超出限制
     * 15 备用IP不正确
     * 16 备用url不正确
     * 17 备用IP不正确
     * 18 短信设置不正确
     * 19 邮件设置不正确
     * 20 此记录已经存在监控
     * 21 监控数量超出限制
     * 22 回调URL不正确
     */
    MONITOR_CREATE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Create","监控添加"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Modify
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     *
     * monitor_id 监控编号，必选
     *
     * port 监控端口，比如80，必选
     *
     * monitor_interval 监控间隔，支持{60|180|360|}，必选
     *
     * monitor_type 监控类型，支持{http|https|cname|url}，必选
     *
     * monitor_path 监控路径，比如/，必选
     *
     * points 监控节点，用,分隔多个，只能选择列表中的节点，并且有数量限制，必选
     *
     * bak_ip 宕机备用，必选，支持任选以下选项中的一个：
     * pass 只监控，不切换
     * pause 老版智能暂停功能，详见https://support.dnspod.cn/Kb/showarticle/tsid/179
     * pause2 智能暂停v2, 发现ip宕机后直接暂停该记录，无其它规则
     * auto 智能切换
     * 用逗号分隔的IP 设置备用IP
     * host 监控主机头，比如 www.dnspod.cn，可选
     *
     * keep_ttl {yes|no} 宕机切换后是否修改ttl，可选，默认为 no
     *
     * sms_notice 短信通知，me域名所有者，share共享用户，用,分隔多选择，比如me,share, 可选
     *
     * email_notice 邮件通知，me域名所有者，share共享用户，用,分隔多选择，比如me,share，可选
     *
     * less_notice {yes|no}是否一个小时内只发一次通知，可选
     *
     * callback_url 可选，回调URL，宕机了会将相关的参数提交到此设置的URL，具体参考回调URL说明，可选
     *
     * callback_key 可选，回调密钥，如果设置了回调URL请设置此参数以保证安全，可选
     *
     * 响应代码：
     * 共通返回
     * 7 监控编号错误
     * 8 监控主机头错误
     * 9 监控端口错误，端口只能是正整数1~65535
     * 10 监控类型不正确
     * 11 监控路径不正确
     * 12 监控间隔不正确
     * 13 监控节点不正确
     * 14 监控节点数量超出限制
     * 15 备用IP不正确
     * 16 备用url不正确
     * 17 备用IP不正确
     * 18 短信设置不正确
     * 19 邮件设置不正确
     * 22 回调URL不正确
     */
    MONITOR_MODIFY(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Modify","监控修改"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Remove
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * monitor_id 监控编号
     * 响应代码：
     * 共通返回
     * 6 监控编号错误
     */
    MONITOR_REMOVE(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Remove","监控删除"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Monitor.Info
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * monitor_id 监控编号
     * 响应代码：
     * 共通返回
     * 7 监控编号错误
     */
    MONITOR_INFO(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Info","获取监控信息"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Setstatus
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * monitor_id 监控编号，必选
     * status {enabled|disabled} 新的状态，必选
     * 响应代码：
     * 共通返回
     * 6 监控编号错误
     * 7 新状态代码错误
     * 8 请先启用域名
     * 9 请先启用记录
     */
    MONITOR_SET_STATUS(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Setstatus","设置监控状态"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Gethistory
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * monitor_id 监控编号，必选
     * hours 获取最近多少个小时的记录，可选
     * 响应代码：
     * 共通返回
     * 6 监控编号错误
     */
    MONITOR_GETHISTORY(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Gethistory","获取监控历史"),
    /**
     * 接口地址：
     * https://dnsapi.cn/Monitor.Userdesc
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * 响应代码：
     * 共通返回
     */
    MONITOR_USERDESC(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Userdesc","获取监控概况"),
    /**
     * 接口地址：
     *  https://dnsapi.cn/Monitor.Getdowns
     * HTTP请求方式：
     * POST
     * 请求参数：
     * 公共参数
     * offset 记录开始的偏移，第一条记录为 0，依次类推，可选
     * length 共要获取的记录的数量，比如获取20条，则为20，可选
     * 响应代码：
     * 共通返回
     */
    MONITOR_GET_DOWNS(HttpPost.METHOD_NAME,"https://dnsapi.cn/Monitor.Getdowns","获取监控警告");

    private String method;
    private String url;
    private String name;

    URLConstants(String method, String url, String name) {
        this.method = method;
        this.url = url;
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
