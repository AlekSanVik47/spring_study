package config;

import annotation.HelloWorldMessageProvider;
import annotation.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import realizationHelloWorld.MessageProvider;
import realizationHelloWorld.MessageRenderer;

@ComponentScan(basePackages = {"main.java.annotention"})
@ImportResource(locations = {"classpath:main.resources/app-context-xml.xml"})
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
