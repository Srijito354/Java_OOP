import java.io.*;

public class Inheritance_demo {
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.sound();
        dog.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("I make sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bhaw Bhaw");
    }
}