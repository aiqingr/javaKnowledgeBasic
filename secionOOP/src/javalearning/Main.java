package javalearning;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car nissan = new Car();
        System.out.println("The model is " + porsche.getModel());
        porsche.setModel("california911");
        System.out.println("The model is " + porsche.getModel());
    }
}
