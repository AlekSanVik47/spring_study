package main.java.realizationHelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        String[]str = {"test", "new", "Hello", "world"};
        args = str;
        if (args.length > 0){
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }
}
