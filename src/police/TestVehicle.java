package police;

import java.util.ArrayList;

public class TestVehicle {
    public static void main(String[] args) {
        ArrayList <Vehicle> pt = new ArrayList<>();
        pt.add(new Car());
        pt.add(new Truck());
        pt.add(new Motorcycle());

        for (int i = 0; i < pt.size(); i++) {
            System.out.println(pt.get(i));
        }
    }
}
