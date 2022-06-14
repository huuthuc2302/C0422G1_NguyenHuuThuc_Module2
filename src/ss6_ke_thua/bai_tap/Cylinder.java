package ss6_ke_thua.bai_tap;

public class Cylinder extends Circle {
    private double height = 5.5;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
       return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString()
                + " , height= "
                + height
                + " , Volume = "
                + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cre = new Cylinder(2.0, "red",5.0);
        System.out.println(cre);
    }
}
