public class Main{
    public static void main(String[] args) {
        // Create a concrete subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create concrete observers
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Register observers with the subject
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Set the state of the subject
        subject.setState("New state!");
    }
}
