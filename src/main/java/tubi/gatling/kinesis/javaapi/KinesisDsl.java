package tubi.gatling.kinesis.javaapi;

import software.amazon.awssdk.services.kinesis.KinesisAsyncClientBuilder;

public class KinesisDsl {
    public static KinesisProtocolBuilder kinesis(KinesisAsyncClientBuilder kinesisBuilder) {
        return new KinesisProtocolBuilder(kinesisBuilder);
    }

    public static ReqWithoutStream kinesis(String requestName) {
        return new ReqWithoutStream(requestName);
    }

    public static ReqWithStream kinesis(String requestName, String streamName) {
        return new ReqWithStream(requestName, streamName);
    }
}
