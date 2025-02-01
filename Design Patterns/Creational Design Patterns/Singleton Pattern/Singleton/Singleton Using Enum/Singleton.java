enum Singleton {
    INSTANCE;

    // A sample method in the Singleton class
    public void someMethod() {
        System.out.println("Singleton using Enum!");
    }

    public static void main(String[] args) {
        // Access the singleton instance and call its method
        Singleton singletonInstance = Singleton.INSTANCE;
        singletonInstance.someMethod();
    }
}

class Main {
 public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        // Both instances refer to the same object
        System.out.println(instance1 == instance2); // Output: true
    }
}
