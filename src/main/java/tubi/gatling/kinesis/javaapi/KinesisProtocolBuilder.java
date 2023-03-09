package tubi.gatling.kinesis.javaapi;

import io.gatling.core.protocol.Protocol;
import io.gatling.javaapi.core.ProtocolBuilder;
import software.amazon.awssdk.services.kinesis.KinesisAsyncClientBuilder;
import tubi.gatling.kinesis.protocol.KinesisProtocol;

public class KinesisProtocolBuilder implements ProtocolBuilder {
    private final KinesisProtocol wrapped;

    public KinesisProtocolBuilder(KinesisAsyncClientBuilder kinesisBuilder) {
        this.wrapped = new KinesisProtocol(kinesisBuilder);
    }

    @Override
    public Protocol protocol() {
        return this.wrapped;
    }
}
