package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int height;
        int width;
        int i;
        int k = 0;
        height = 4;
        width = 6;
        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println(" ");
        for (i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" ");
        for (i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (i = 1; i <= 10; ++i, k = 0) {
            for (int space = 1; space <= 10 - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
