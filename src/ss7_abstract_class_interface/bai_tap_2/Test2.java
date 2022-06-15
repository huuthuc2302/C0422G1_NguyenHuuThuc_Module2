package ss7_abstract_class_interface.bai_tap_2;

import ss7_abstract_class_interface.bai_tap.Circle;
import ss7_abstract_class_interface.bai_tap.Rectangle;
import ss7_abstract_class_interface.bai_tap.Shape;

public class Test2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes [0] = new Square1(2.0);
        shapes [1] = new Shape("red",false);
        shapes [2] = new Shape("green",true);
        for (Shape s: shapes
        ) {
            if (s instanceof Square1) {
                ((Square1)s).howToColor();
            }
            System.out.println(s);
        }




    }
}
