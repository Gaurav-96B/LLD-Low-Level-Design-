class Student implements Cloneable{
    String name;
    int id;
    Address address;
    
    public Student(){
        
    }
    public Student(String name,int id,Address address){
        this.name=name;
        this.id=id;
        this.address=address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setAddress(Address address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public Address getAddress(){
        return address;
    }
    public String toString(){
        return this.name+" "+this.id+" "+this.address;
    }
    public Student clone() throws CloneNotSupportedException{
        Student student=(Student)super.clone();
        student.address=(Address)address.clone();
        return student;
    }
}

class Address implements Cloneable{
    String city;
    String state;
    
    public Address(){
        
    }
    public Address(String city,String state){
        this.city=city;
        this.state=state;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    
    public void setState(String state){
       this.state=state; 
    }
    
    public String getCity(){
        return city;
    }
    
    public String getState(){
       return state; 
    }
    
    public String toString(){
        return this.city+" "+this.state;
    }
    public Address clone() throws CloneNotSupportedException{
        return (Address)super.clone();
    }
}
class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Address address=new Address("New-York","America");
    Student student=new Student("Yash",1,address);
    Student clonedStudent=student.clone();
    clonedStudent.getAddress().setCity("Boston");
    System.out.println(student);
    System.out.println(clonedStudent);
    }
}
