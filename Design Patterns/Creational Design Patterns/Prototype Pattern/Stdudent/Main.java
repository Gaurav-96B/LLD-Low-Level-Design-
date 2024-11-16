class Student implements Cloneable{
    private String name;
    private int roll_no;
    
    public Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return roll_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRollNo(int roll_no){
        this.roll_no=roll_no;
    }
    
    public String toString(){
        return this.name+" "+this.roll_no;
    }
    public Object clone() throws CloneNotSupportedException{
       return super.clone();
    }
    
}
class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Student s1=new Student("Saurav",123);
    Student s2= (Student)s1.clone();
    System.out.println(s1);
    System.out.println(s2);
    }
}
