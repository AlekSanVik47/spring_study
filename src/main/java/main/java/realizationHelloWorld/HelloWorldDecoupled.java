package main.java.realizationHelloWorld;

import main.java.annotention.HelloWorldMessageProvider;
import main.java.annotention.StandardOutMessageRenderer;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
