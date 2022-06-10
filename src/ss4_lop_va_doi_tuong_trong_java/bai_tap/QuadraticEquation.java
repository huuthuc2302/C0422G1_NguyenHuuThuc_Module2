package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c ;


    public QuadraticEquation(double a, double b, double c ){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta() {
        double delta = (Math.pow(this.b,2)) - (4 * this.a * this.c );
        return delta;
    }
    public double getRoot1() {
        return -(this.b) + Math.sqrt(this.getDelta() / (2 * a));
    }
    public double getRoot2() {
        return -(this.b) - Math.sqrt(this.getDelta() / (2 * a));
    }

    public void equation(){
        if(this.getDelta()>0){
            System.out.println("phương trình có 2 nghiệm " + getRoot1() + "\n" + getRoot2());
        }else if (this.getDelta()==0){
            System.out.println("phương trình có 1 nghiệm " + getRoot1());
        }else {
            System.out.println("phương trình vô nghiệm ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);
        ptb2.equation();
    }
}
