package javalearning;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 6);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 28, new Resolution(2540, 1440));

	    Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4,6, "v2.55");

	    PC thePC = new PC(theCase, theMonitor, theMotherBoard);

	    thePC.getMonitor().drawPixelAt(1000,1000,"Blue");
	    thePC.getMotherboard().loadProgram("Linux");
	    thePC.getTheCase().pressPowerButton();

    }
}
