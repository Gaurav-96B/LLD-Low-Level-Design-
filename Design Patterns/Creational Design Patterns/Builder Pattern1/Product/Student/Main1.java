class Student{
    private int id;
    private String name;
    
    public Student(StudentBuilder studentBuilder){
        this.id=studentBuilder.id;
        this.name=studentBuilder.name;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
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
        Student s1=new Student.StudentBuilder().setId(1).setName("Saurav").build();
        System.out.println(s1);
    }
}
