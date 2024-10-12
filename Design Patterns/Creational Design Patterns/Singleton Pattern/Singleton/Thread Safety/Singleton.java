public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Initialization code
    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
             instance = new Singleton();
            }
        return instance;
    }

             OR
    
    // Double-checked locking for thread safety
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
