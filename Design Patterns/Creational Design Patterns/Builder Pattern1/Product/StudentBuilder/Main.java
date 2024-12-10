class Student{
    private int id;
    private String name;
    
    public Student(StudentBuilder studentBuilder){
        this.id=studentBuilder.id;
        this.name=studentBuilder.name;
    }
    
    public String toString(){
        return this.id+" "+this.name;
    }
    
    public static class StudentBuilder{
        private int id;
        private String name;
        
        public StudentBuilder setId(int id){
            this.id=id;
            return this;
        }
        public StudentBuilder setName(String name){
            this.name=name;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}

class Main {
    public static void main(String[] args){
        Student student=new Student.StudentBuilder().setId(1).setName("Saurav").build();
        System.out.println(student);
    }
}
