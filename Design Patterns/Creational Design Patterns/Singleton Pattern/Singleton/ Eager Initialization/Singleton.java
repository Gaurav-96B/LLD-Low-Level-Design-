public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {
        // Initialization code
    }

    // The public method to get the singleton instance
    public static Singleton getInstance() {
        return instance;
    }
}
