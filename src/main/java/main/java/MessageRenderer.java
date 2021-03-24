package main.java;

public interface MessageRenderer {
    void render();                                  // средство воспроизведения
    void setMessageProvider(MessageProvider provider); //Поставщик
    MessageProvider getMessageProvider();
}
