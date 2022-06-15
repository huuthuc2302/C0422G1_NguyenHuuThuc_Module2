package ss7_abstract_class_interface.bai_tap_2;

import ss7_abstract_class_interface.bai_tap.Shape;

public class Square1 extends Shape implements Corlorable {
    double side;
    public Square1 (){

    }
    public Square1 (double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea () {
        return getSide()*getSide();
    }

    @Override
    public String toString() {
        return "Square1{" +
                "side=" + side +  "area=" + getArea()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides");
    }
}
