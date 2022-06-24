package ss15.bai_tap;

import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException{
        if ( a <= 0 || b <= 0 || c <= 0 ){
            throw new IllegalTriangleException("Cạnh tam giác không được bé hơn or bằng 0");
        }else if (a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalTriangleException(" Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }


}