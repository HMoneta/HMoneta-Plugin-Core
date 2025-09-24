package fan.summer.entity;

import fan.summer.plugins.common.enums.PluginType;

/**
 * 插件信息类，用于存储和管理插件的相关信息。
 * 该类包含插件名称、版本号以及开发者信息等属性，并提供了相应的getter和setter方法来访问这些属性。
 */
public class PluginInfo {
    private String pluginName;
    private PluginType pluginType;
    private String pluginVersion;
    private String developer;

    public PluginInfo() {
    }

    /**
     * 构造一个新的PluginInfo实例，初始化插件名称、版本号和开发者信息。
     * @param pluginName 插件的名称
     * @param pluginVersion 插件的版本号
     * @param developer 插件的开发者姓名或团队名
     */
    public PluginInfo(String pluginName, PluginType pluginType, String pluginVersion, String developer) {
        this.pluginName = pluginName;
        this.pluginType = pluginType;
        this.pluginVersion = pluginVersion;
        this.developer = developer;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginType getPluginType() {
        return pluginType;
    }

    public void setPluginType(PluginType pluginType) {
        this.pluginType = pluginType;
    }

    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
