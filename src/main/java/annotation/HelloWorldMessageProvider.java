package annotation;

import org.springframework.stereotype.Component;
import realizationHelloWorld.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
