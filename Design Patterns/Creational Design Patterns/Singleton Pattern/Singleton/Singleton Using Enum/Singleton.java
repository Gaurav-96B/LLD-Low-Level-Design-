public enum Singleton {
    INSTANCE;
    public void someMethod() {
        System.out.println("Singleton using Enum!");
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
