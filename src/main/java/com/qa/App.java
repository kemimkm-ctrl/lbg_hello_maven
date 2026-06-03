package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Kemi"));
        System.out.println(sayHelloToSomeone("Kemi is great"));
        System.out.println(sayHelloToSomeone("say goodbye"));
        System.out.println(sayHelloToSomeone("Everyone"));
        System.out.println(sayHelloToSomeone("pommy"));
        System.out.println(sayHelloToSomeone("bye"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Do not say Goodbye World!";
    }
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }
    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
