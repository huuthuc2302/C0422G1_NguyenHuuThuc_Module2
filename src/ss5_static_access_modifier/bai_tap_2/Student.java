package ss5_static_access_modifier.bai_tap_2;

public class Student {
    private String name = "Long";
    private String classes = "C0322G1";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

}

