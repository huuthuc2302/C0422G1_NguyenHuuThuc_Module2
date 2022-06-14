package ss6_ke_thua.bai_tap_1;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void  setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;

    }

    public float[] getXYZ(){
        float[] arr2 = {super.getX(), super.getY(), z};
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + getZ() +
                '}';
    }

    public static void main(String[] args) {
        Point3D poi3 = new Point3D(3.0f, 5.0f,4.0f);
        System.out.println(poi3);
    }
}
