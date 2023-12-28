public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Initialization code
    }

    // The public method to get the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
