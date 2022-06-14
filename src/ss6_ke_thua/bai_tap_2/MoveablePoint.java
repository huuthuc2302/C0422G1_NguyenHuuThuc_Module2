package ss6_ke_thua.bai_tap_2;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        super.getX();
        super.getY();
    }

    public float[] getSpeed() {
        float[] arr2 = {super.getX(), super.getY()};
        return arr2;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MoveablePoint move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        Point point = new Point(3.0f,2.0f);
        System.out.println(point);
        MoveablePoint mov = new MoveablePoint(2.0f,3.0f,2.0f,3.0f);
        System.out.println(mov);
        mov.setSpeed(5.0f,2.0f);
        System.out.println(mov.move());
    }
}
