package ss5_static_access_modifier.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println("radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
    }
}
