package javalearning;

public class Lamp {
    private String style;
    private boolean battery;
    private int globleRating;

    public Lamp(String style, boolean battery, int globleRating) {
        this.style = style;
        this.battery = battery;
        this.globleRating = globleRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> turn on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobleRating() {
        return globleRating;
    }
}
