package ss5_static_access_modifier.bai_tap_2;

public class Test {
    public static void main(String[] args) {
        Student qtv = new Student();
        qtv.setName("Thức");
        qtv.setClasses("C0422G1");
        System.out.println(qtv.getName());
        System.out.println(qtv.getClasses());
    }
}
