package ss1_prodution_to_java.Thuc_hanh;

import java.util.Scanner;

public class CanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println(" Nhập cân nặng ");
        weight = scanner.nextDouble();

        System.out.println(" Nhập chiều cao ");
        height = scanner.nextDouble();

        bmi = weight/ Math.pow(height,2);
        if (bmi < 18 )
            System.out.println(" Chỉ số BMI là : " + bmi + " Thiếu cân ");
        else if (bmi < 25.0)
            System.out.println(" Chỉ số BMI là : " + bmi + " Bình thường ");
        else if (bmi < 30.0)
            System.out.println(" Chỉ số BMI là : " + bmi + " Thừa cân ");
        else
            System.out.println(" Chỉ số BMI là : " + bmi + " Béo phì ");

    }


}
