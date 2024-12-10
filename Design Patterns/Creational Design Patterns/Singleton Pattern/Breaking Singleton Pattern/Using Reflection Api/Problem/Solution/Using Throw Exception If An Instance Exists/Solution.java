public class Singleton {
    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Reflection is not allowed!");
        }
    }

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
