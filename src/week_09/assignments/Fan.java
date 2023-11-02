package week_09.assignments;

public class Fan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    public String color = "blue";

    Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static String toString(Fan fan) {
        String result;
        if (fan.on) {
            result = "Fan speed: " + fan.getSpeed() + ", color: " + fan.color + ", radius: " + fan.getRadius();
        } else {
            result = "Fan color: " + fan.color + ", radius: " + fan.getRadius() + "\nFan is off";
        }
        return result;
    }
}
