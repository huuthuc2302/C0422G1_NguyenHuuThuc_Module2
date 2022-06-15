package ss7_abstract_class_interface.bai_tap;

import ss6_ke_thua.thuc_hanh.Rectangle;

public class Square extends Rectangle implements Resizeable {

    public Square() {
    }

    public Square(double side){
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side );
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percrent) {

    }
}
