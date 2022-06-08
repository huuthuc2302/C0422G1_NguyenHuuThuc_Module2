package ss2_vong_lap_trong_java.bai_tap;

public class SoNguyenToNhoHonMotTram {
    public static void main(String[] args) {
        int snt = 2;
        int count = 0;
        int tmp;
        while (count < 30) {
            tmp = 0;
            for (int i = 2; i < snt; i++) {
                if (snt % i == 0) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0 && snt <100) {
                System.out.println(snt);
                count++;
            }
            snt++;
        }
    }
}
