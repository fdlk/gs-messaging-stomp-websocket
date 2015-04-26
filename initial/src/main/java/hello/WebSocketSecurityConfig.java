package hello;

import org.springframework.security.config.annotation.web.messaging.MessageSecurityMetadataSourceRegistry;
import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer;

public class WebSocketSecurityConfig extends AbstractSecurityWebSocketMessageBrokerConfigurer
{
	@Override
	protected void configureInbound(MessageSecurityMetadataSourceRegistry messages)
	{
		messages.simpDestMatchers("/**").permitAll();
		// .simpDestMatchers("/**").hasRole("ADMIN");
	}
}
