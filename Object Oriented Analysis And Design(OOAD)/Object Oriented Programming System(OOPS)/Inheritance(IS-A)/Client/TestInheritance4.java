public class TestInheritance4 {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.swim(); // Accessing method from Swimming interface
        myDuck.fly();  // Accessing method from Flying interface
    }
}
