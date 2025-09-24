package fan.summer.plugins.common.enums;

import fan.summer.plugins.core.dns.DNSProviderPlugin;

/**
 * 插件类型枚举类，用于标识不同类型的插件。
 * 当前定义了 DNS_PLUGIN 类型，与 DNS 服务提供商相关的插件。
 * 每个枚举值关联一个具体的插件实现类，可以通过 getAssociatedClass 方法获取该类。
 */
public enum PluginType {
    DNS_PLUGIN(DNSProviderPlugin.class);

    private final Class<?> associatedClass;

    PluginType(Class<?> clazz) {
        this.associatedClass = clazz;
    }

    public Class<?> getAssociatedClass() {
        return associatedClass;
    }
}
