public class Student {
    private String name;
    private int age;
    private String grade;
    private String address;

    private Student(String name, int age, String grade, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.address = address;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }
    public String getAddress() { return address; }
}

public class StudentBuilder {
    private String name;
    private int age;
    private String grade;
    private String address;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        return new Student(name, age, grade, address);
    }
}

class Main {
    public static void main(String[] args){
      StudentBuilder builder = new StudentBuilder();
      Student student = builder.setName("Gaurav").setAge(25).setGrade("A").setAddress("Mumbai, Maharashtra") .build();
      System.out.println(student.getName());
    }
}
