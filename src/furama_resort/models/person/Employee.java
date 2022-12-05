package furama_resort.models.person;

public class Employee extends Person {
    private String level; //trình độ
    private String position; //Vị trí
    private double salary; //lương

    public Employee(int id, String name, String address, String gender, String s, int idCard, int phoneNumber, String level, String position, double salary) {
    }

    public Employee(int id,
                    String name,
                    String dateOfBirth,
                    String address,
                    String gender,
                    int idCard,
                    int phoneNumber,
                    String email,
                    String level,
                    String position,
                    double salary) {
        super(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee : " + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary ;
    }

    public String getInfoToCSV(){
        return id + "," +
                name + "," +
                dateOfBirth + "," +
                address + "," +
                gender + "," +
                idCard + "," +
                phoneNumber + "," +
                email + "," +
                level + "," +
                position + "," +
                salary;
    }
}
