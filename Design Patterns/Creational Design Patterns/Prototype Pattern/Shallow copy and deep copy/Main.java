public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Line 1", "Line 2", 500001, "Hyderabad", "Telangana");
        
        Person person1 = new Person("Meennu Jaiswal", 30, address);
        
        Person person2 = person1.clone();
        person2.setName("Kalyan");
        person2.setAge(25);
        person2.getAddress().setState("Madhya Pradesh");
        
        System.out.println(person1.getName() + ", " + person1.getAge() + ", " + person1.getAddress().getState()); 
        System.out.println(person2.getName() + ", " + person2.getAge() + ", " + person2.getAddress().getState()); 
    }
}
