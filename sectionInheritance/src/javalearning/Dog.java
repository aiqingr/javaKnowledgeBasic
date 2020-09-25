package javalearning;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.chew() method is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() method is called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() method is called");
//      注意下面的move使用方式 如果使用super.move 将会只去寻找父辈的move 而不会去寻找当前class的override的move
//      结果将不会有有关于moveLeg的内容
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() method is called");
        move(10);
    }

    private void moveLegs() {
        System.out.println("Dog.moveLegs() method is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() method is called");
        moveLegs();
        super.move(speed);
    }
}
