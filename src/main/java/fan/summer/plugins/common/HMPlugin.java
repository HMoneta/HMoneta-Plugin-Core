package fan.summer.plugins.common;

import fan.summer.entity.PluginInfo;
import fan.summer.plugins.core.logger.PluginLogger;


/**
 * HMPlugin 接口定义了插件的基本行为，包括提供插件信息和初始化插件。
 * 该接口是所有具体插件实现的基础，确保每个插件都能正确地提供其元数据并进行必要的初始化设置。
 *
 * @see PluginInfo 获取关于插件的详细信息
 * @see PluginLogger 日志记录器，用于在插件运行时输出日志信息
 */
public interface HMPlugin {
    PluginInfo pluginInfo();

    void init(PluginLogger logger);
}