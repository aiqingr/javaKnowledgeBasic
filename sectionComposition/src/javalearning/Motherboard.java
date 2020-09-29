package javalearning;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bois;

    public Motherboard(String model, String manufacture, int ramSlots, int cardSlots, String bois) {
        this.model = model;
        this.manufacturer = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bois = bois;
    }

    public void loadProgram(String programName) {
        System.out.println("String " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBois() {
        return bois;
    }
}
