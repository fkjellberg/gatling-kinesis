package tubi.gatling.kinesis.javaapi;

public class ReqWithStream {
    private final String requestName;
    private final String streamName;

    public ReqWithStream(String requestName, String streamName) {
        this.requestName = requestName;
        this.streamName = streamName;
    }

    public PutRecordActionBuilder putRecord() {
        return new PutRecordActionBuilder(this.requestName, this.streamName);
    }
}
