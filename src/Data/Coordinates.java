package Data;

public class Coordinates {

    private Float x; // поле не может быть null, max value = 620
    private Float y; // поле не может быть null, max value = 784
    private static Float max_x = Float.valueOf(620);
    private static Float max_y = Float.valueOf(784);

    public Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public static boolean checkValidX(Float x) {
        if (x > max_x) return false;
        return true;
    }

    public static boolean checkValidY (Float y) {
        if (y > max_y) return false;
        return true;
    }

    public static Float getMaxX() {
        return max_x;
    }

    public static Float getMaxY() {
        return max_y;
    }

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }

}
