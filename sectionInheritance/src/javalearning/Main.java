package javalearning;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("yokie", 1, 1, 4,5,2, 4,1,20, "long likely");
//        dog.eat();
        dog.walk();
//        dog.run();
    }
}
