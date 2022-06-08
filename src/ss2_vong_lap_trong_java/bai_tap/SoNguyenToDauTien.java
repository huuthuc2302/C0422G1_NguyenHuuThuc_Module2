package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class SoNguyenToDauTien {
    public static void main(String[] args) {
        int snt = 2;
        int count = 0;
        int tmp;
        while (count < 20) {
            tmp = 0;
            for (int i = 2; i < snt; i++) {
                if (snt % i == 0) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) {
                System.out.println(snt);
                count++;
            }
            snt++;
        }
    }
}
