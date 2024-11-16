class Student{
    String name;
    int roll_no;
    
    private Student(StudentBuilder studentBuilder){
        this.name=studentBuilder.name;
        this.roll_no=studentBuilder.roll_no;
    }
    
    public String toString(){
        return this.name+" "+this.roll_no;
    }
    
    public static class StudentBuilder{
        String name;
        int roll_no;
        
        StudentBuilder setName(String name){
            this.name=name;
            return this;
        }
        StudentBuilder setRollNo(int roll_no){
            this.roll_no=roll_no;
            return this;
        }
        
        public Student build(){
            return new Student(this);
        }
    }
}
class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
   Student student=new Student.StudentBuilder()
   .setName("saurav")
   .setRollNo(123).build();
   System.out.println(student);
    }
}
