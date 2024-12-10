class Singleton implements Cloneable {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance()
    {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
    public Singleton clone() throws CloneNotSupportedException{
        return instance;
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       
        Singleton instance1 = Singleton.getInstance();
        
        //Breaking Singleton Pattern Using Clone Method
        Singleton instance2 = instance1.clone();
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
       
    }
}
