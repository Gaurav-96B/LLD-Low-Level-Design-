class Student implements Cloneable{
    private int id;
    private String name;
    private Address address;
  
    public Student(){
        
    }
    
    public Student(int id, String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
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
    
    public String getName(String name){
        return name;
    }
    
     public void setAddress(Address address){
        this.address=address;
    }
    
    
    public Address getAddress(Address address){
        return address;
    }
    
    public String toString(){
        return this.id+" "+this.name+" "+this.address;
    }
    
    public Object clone() throws CloneNotSupportedException{
        Student student=(Student)super.clone();
        student.address=(Address)address.clone();
        return student;
    }
}

class Address implements Cloneable{
    private String city;
    private String state;
    
    public Address(){
        
    }
    
    public Address(String city, String state){
        this.city=city;
        this.state=state;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setState(String state){
        this.state=state;
    }
    
    public String getState(){
        return state;
    }
    
    public String toString(){
        return this.city+" "+this.state;
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address address=new Address("New-York","America");
        Student s1=new Student(1,"Saurav",address);
        Student s2=(Student)s1.clone();
        address.setCity("Boston");
        System.out.println(s1);
        System.out.println(s2);
        
    }
}
