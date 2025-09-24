package fan.summer.entity.dns;


/**
 * DNSRecordInfo 类用于封装 DNS 记录的相关信息。
 * 该类提供了对 DNS 记录类型、记录 ID 以及记录值的存储和访问功能。
 * 它可以用于表示特定域名和子域名的 DNS 记录详细信息。
 *
 * @author MuskStark
 */
public class DNSRecordInfo {
    private String Type;
    private long RecordId;
    private String Value;

    public DNSRecordInfo() {

    }

    public DNSRecordInfo(String type, long recordId, String value) {
        Type = type;
        RecordId = recordId;
        Value = value;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public long getRecordId() {
        return RecordId;
    }

    public void setRecordId(long recordId) {
        RecordId = recordId;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}