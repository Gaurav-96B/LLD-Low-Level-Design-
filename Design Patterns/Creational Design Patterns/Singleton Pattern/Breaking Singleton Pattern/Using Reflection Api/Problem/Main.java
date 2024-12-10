import java.lang.reflect.*;
class Singleton {
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

public class Main {
    public static void main(String[] args) {
        try{
        Singleton instance1 = Singleton.getInstance();
        
        //Breaking Singleton Pattern
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true); 
        Singleton instance2 = constructor.newInstance();
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        }
        catch(Exception e){
            
        }
    }
}
