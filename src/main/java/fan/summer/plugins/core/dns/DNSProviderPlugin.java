package fan.summer.plugins.core.dns;

import fan.summer.entity.dns.DNSRecordInfo;
import fan.summer.plugins.common.HMPlugin;
import org.pf4j.ExtensionPoint;

import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * DNSProviderPlugin 接口定义了与 DNS 服务提供商交互的插件所需实现的方法。
 * 该接口扩展了 HMPlugin 和 ExtensionPoint，确保插件能够提供必要的信息并作为系统中的一个扩展点工作。
 */
public interface DNSProviderPlugin extends HMPlugin, ExtensionPoint {

    /**
     * 使用提供的凭据进行身份验证。
     *
     * @param credentials 包含身份验证所需信息的键值对映射，例如用户名和密码或API密钥等
     */
    void authenticate(Map<String, String> credentials);

    /**
     * 返回此插件支持的身份验证方式集合。
     *
     * @return 包含所有受支持身份验证方法的字符串集合
     */
    Set<String> authenticateWay();

    /**
     * 返回当前 DNS 服务提供商的名称。
     *
     * @return 当前 DNS 服务提供商的名称字符串
     */
    String providerName();

    /**
     * 检查指定域名和子域名的DNS记录。
     *
     * @param domain 主域名，例如 "example.com"
     * @param subDomain 子域名，例如 "www"，与主域名结合形成完整的域名如 "www.example.com"
     * @return 包含所查询域名及子域名的所有DNS记录信息的列表，每个元素为一个DNSRecordInfo对象
     */
    List<DNSRecordInfo> dnsCheck(String domain, String subDomain);

    /**
     * 修改指定域名下的DNS记录。
     *
     * @param domain 主域名，例如 "example.com"
     * @param subDomain 子域名，例如 "www"，与主域名结合形成完整的域名如 "www.example.com"
     * @param type DNS记录类型，例如 "A", "CNAME", 或 "TXT"
     * @param value 新的DNS记录值
     * @return 如果DNS记录修改成功返回true，否则返回false
     */
    boolean modifyDns(String domain, String subDomain, String type, String value);

    /**
     * 删除指定域名和子域名下的特定类型DNS记录。
     *
     * @param domain 主域名，例如 "example.com"
     * @param subDomain 子域名，例如 "www"，与主域名结合形成完整的域名如 "www.example.com"
     * @param type DNS记录类型，例如 "A", "CNAME", 或 "TXT"
     * @return 如果DNS记录删除成功返回true，否则返回false
     */
    boolean deleteDns(String domain, String subDomain, String type);


}
