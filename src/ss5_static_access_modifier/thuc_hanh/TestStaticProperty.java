package ss5_static_access_modifier.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car honda1 = new Car("wave", "ron92");
        System.out.println("name : " + honda1.getName());
        System.out.println("engine : " + honda1.getEngine());
        System.out.println("numbercar : " + Car.numberOfCar);

        Car honda2 = new Car("sh150", "ron95");
        System.out.println("name : " + honda2.getName());
        System.out.println("engine : " + honda2.getEngine());
        System.out.println("numbercar : " + Car.numberOfCar);
    }
}
