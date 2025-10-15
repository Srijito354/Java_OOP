import java.io.*;

public class Inheritance {
    public static void main(String[] args)
    {
        Animal dawg = new Animal();
        dawg.sound();
        Dog Tommy = new Dog();
        Tommy.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Tommy barks");
    }
}