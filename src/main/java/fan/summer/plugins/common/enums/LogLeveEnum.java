package fan.summer.plugins.common.enums;

/**
 * 定义了日志级别的枚举类型。
 * 包含四个级别：DEBUG, INFO, WARNING 和 ERROR，分别对应整数值 0, 1, 2, 3。
 * 可以通过 getLevel() 方法获取每个枚举值对应的整数级别。
 */
public enum LogLeveEnum {
    DEBUG(0),
    INFO(1),
    WARNING(2),
    ERROR(3);

    private final int level;

    public int getLevel() {
        return level;
    }

    LogLeveEnum(int level) {
        this.level = level;
    }

}
