package tubi.gatling.kinesis.protocol

import io.gatling.core.protocol.ProtocolComponents
import io.gatling.core.session.Session
import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient, KinesisAsyncClientBuilder }

case class KinesisComponents(kinesisBuilder: KinesisAsyncClientBuilder) extends ProtocolComponents {
  lazy val kinesisClient: KinesisAsyncClient = kinesisBuilder.build()

  override def onStart: Session => Session = Session.Identity

  override def onExit: Session => Unit = ProtocolComponents.NoopOnExit
}
