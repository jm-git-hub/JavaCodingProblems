package CompositionProblem;

public class Ceiling {
    private int height;
    private int paintedColor;

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    public Ceiling(int height, int printedColor) {
        this.height = height;
        this.paintedColor = printedColor;
    }
}
