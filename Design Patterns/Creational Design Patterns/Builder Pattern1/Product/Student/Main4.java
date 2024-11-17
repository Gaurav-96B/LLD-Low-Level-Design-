import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Student {
    private String name;
    private int age;
    private String grade;
    private String address;
}

class Main {
    public static void main(String[] args){
      Student student = Student.builder().name("Gaurav").age(25) .grade("A") .address("Mumbai, Maharashtra") .build();
      System.out.println(student);
}
