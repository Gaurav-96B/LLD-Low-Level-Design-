enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton using Enum");
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
