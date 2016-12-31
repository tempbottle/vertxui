package live.connector.vertxui.server.samples.chatWebsocket;

import java.lang.invoke.MethodHandles;

import io.vertx.core.Vertx;
import live.connector.vertxui.client.samples.chatWebsocket.Client;
import live.connector.vertxui.server.samples.AllExamplesServer;

public class ExampleChatWebsocket extends AllExamplesServer {

	public ExampleChatWebsocket() {
		super(Client.class);
	}

	public static void main(String[] args) {
		Vertx.vertx().deployVerticle(MethodHandles.lookup().lookupClass().getName());
	}

}