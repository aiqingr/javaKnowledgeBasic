package javalearning;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 5,3,1,1);

        Lamp lamp = new Lamp("classic", false, 56);

        Bedroom bedRoom = new Bedroom("Nick", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
