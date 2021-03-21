package CompositionProblem;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battary, int gloRating) {
        this.style = style;
        this.battery = battary;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning On");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
