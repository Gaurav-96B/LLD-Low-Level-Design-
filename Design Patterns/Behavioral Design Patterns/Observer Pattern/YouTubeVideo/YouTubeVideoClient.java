//Observer
interface Observer {
    void update(String message);
}

//Concrete Observer
class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

//Subject
class YoutubeChannel {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void uploadVideo(String title) {

        System.out.println("Uploaded: " + title);

        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {

        for (Observer observer : observers) {
            observer.update(title);
        }
    }
}

//Client
public class Main {

    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();

        User u1 = new User("John");
        User u2 = new User("Alex");
        User u3 = new User("Bob");

        channel.subscribe(u1);
        channel.subscribe(u2);
        channel.subscribe(u3);

        channel.uploadVideo("Java Observer Pattern");
    }
}
