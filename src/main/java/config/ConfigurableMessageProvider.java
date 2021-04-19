package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realizationHelloWorld.MessageProvider;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    @Autowired
    public ConfigurableMessageProvider(/*@Value("Configurable message")*/ String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
