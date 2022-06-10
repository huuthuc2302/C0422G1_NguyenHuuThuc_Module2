package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }
    public String toString() {
        if(this.isOn()){
            return "\ncolor : " + this.color + "\nradius : " + this.radius + "\nfan is off";
        }else {
            return "\nspeed : " + this.speed + "\ncolor : " + this.color + "\nradius : " + this.radius + "\nfan is on";
        }
    }

    public static void main(String[] args) {
       Fan fan1 = new Fan();
       fan1.setSpeed(fan1.FAST);
       fan1.setRadius(10);
       fan1.setColor("yellow");
       fan1.setOn(true);
       System.out.println("Hiển thị quạt 1 : " + fan1.toString());

       Fan fan2 = new Fan();
       fan2.setSpeed(fan2.MEDIUM);
       fan2.setRadius(5);
       System.out.println("\nHiển thị quạt 2 : " + fan2.toString());

    }
}
