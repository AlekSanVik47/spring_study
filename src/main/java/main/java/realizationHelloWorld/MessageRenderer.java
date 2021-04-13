package main.java.realizationHelloWorld;

public interface MessageRenderer {
    void render();                                  // средство воспроизведения
    void setMessageProvider(MessageProvider provider); //Поставщик
    MessageProvider getMessageProvider();
}
