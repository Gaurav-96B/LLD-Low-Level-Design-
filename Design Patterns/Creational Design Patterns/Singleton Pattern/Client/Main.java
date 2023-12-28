public class SingletonExample {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Both instances refer to the same object
        System.out.println(instance1 == instance2); // Output: true
    }
}
