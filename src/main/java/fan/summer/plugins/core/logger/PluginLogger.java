package fan.summer.plugins.core.logger;

import fan.summer.plugins.common.enums.LogLeveEnum;

/**
 * 插件日志记录接口，提供了不同级别的日志记录方法。
 * 通过该接口可以方便地在插件中记录调试信息、常规信息、警告和错误。
 * 此外，还提供了一个默认方法来根据指定的日志级别自动选择合适的记录方式。
 */
public interface PluginLogger {
    void debug(String message);

    void info(String message);

    void warn(String message);

    void error(String message);

    /**
     * 根据给定的日志级别记录插件运行过程中的信息。
     *
     * @param stepName 插件执行步骤的名称，用于标识日志记录的具体位置或阶段
     * @param detail 需要记录的详细信息
     * @param logLeveEnum 日志级别枚举值，决定该条目被记录为调试、信息、警告还是错误
     */
    default void logger(String stepName, String detail, LogLeveEnum logLeveEnum) {
        switch (logLeveEnum) {
            case WARNING -> warn(String.format("[Plugin] %s | %s", stepName, detail));
            case ERROR -> error(String.format("[Plugin] %s | %s", stepName, detail));
            case DEBUG -> debug(String.format("[Plugin] %s | %s", stepName, detail));
            default -> info(String.format("[Plugin] %s | %s", stepName, detail));
        }
    }
}