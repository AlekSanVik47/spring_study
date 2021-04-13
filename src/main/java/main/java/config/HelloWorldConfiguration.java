package main.java.config;

import main.java.realizationHelloWorld.HelloWorldMessageProvider;
import main.java.realizationHelloWorld.MessageProvider;
import main.java.realizationHelloWorld.MessageRenderer;
import main.java.realizationHelloWorld.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider() );
        return renderer;

    }
}
