package tubi.gatling.kinesis.javaapi;

public class ReqWithoutStream {
    private final String requestName;

    public ReqWithoutStream(String requestName) {
        this.requestName = requestName;
    }

    public ReqWithStream stream(String streamName) {
        return new ReqWithStream(requestName, streamName);
    }
}
