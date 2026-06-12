import java.io.Serializable;
class Singleton implements Serializable {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
class Main{
  public static void main(String args[]){
    Singleton s1 = Singleton.getInstance();
    ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("file.txt"));
    oos.writeObject(s1);
    oos.close();
    ObjectInputStream ois =new ObjectInputStream(new FileInputStream("file.txt"));
    Singleton s2 =(Singleton) ois.readObject();
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
}
}
