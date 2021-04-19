package annotation;

import org.springframework.context.support.GenericXmlApplicationContext;
import realizationHelloWorld.MessageProvider;

public class DeclareSpringComponents {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:resources/app-context.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
