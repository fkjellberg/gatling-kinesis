package tubi.gatling.kinesis.javaapi;

import static io.gatling.javaapi.core.internal.Expressions.*;

import java.util.function.Function;

import io.gatling.javaapi.core.ActionBuilder;
import io.gatling.javaapi.core.Session;
import software.amazon.awssdk.core.SdkBytes;

public class PutRecordActionBuilder implements ActionBuilder {
    private final tubi.gatling.kinesis.action.PutRecordActionBuilder wrapped;

    public PutRecordActionBuilder(tubi.gatling.kinesis.action.PutRecordActionBuilder wrapped) {
        this.wrapped = wrapped;
    }

    public PutRecordActionBuilder(String requestName, String streamName) {
        this.wrapped = new tubi.gatling.kinesis.action.PutRecordActionBuilder(toStringExpression(requestName), streamName, null, null);
    }

    public PutRecordActionBuilder streamName(String streamName) {
        return new PutRecordActionBuilder(wrapped.streamName(streamName));
    }

    public PutRecordActionBuilder payload(SdkBytes payload) {
        return new PutRecordActionBuilder(wrapped.payload(toStaticValueExpression(payload)));
    }

    public PutRecordActionBuilder payload(Function<Session, SdkBytes> payload) {
        return new PutRecordActionBuilder(wrapped.payload(javaFunctionToExpression(payload)));
    }

    public PutRecordActionBuilder partitionKey(String key) {
        return new PutRecordActionBuilder(wrapped.partitionKey(toStringExpression(key)));
    }

    public PutRecordActionBuilder partitionKey(Function<Session, String> key) {
        return new PutRecordActionBuilder(wrapped.partitionKey(javaFunctionToExpression(key)));
    }

    @Override
    public io.gatling.core.action.builder.ActionBuilder asScala() {
        return wrapped;
    }
}
