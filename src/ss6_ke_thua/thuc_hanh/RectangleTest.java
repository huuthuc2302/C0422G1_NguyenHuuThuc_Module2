package ss6_ke_thua.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println(rec1);

        rec1 = new Rectangle(2.3, 5.4);
        System.out.println(rec1);

        rec1 = new Rectangle("black", false, 3.5, 7.4);
        System.out.println(rec1);
    }
}
