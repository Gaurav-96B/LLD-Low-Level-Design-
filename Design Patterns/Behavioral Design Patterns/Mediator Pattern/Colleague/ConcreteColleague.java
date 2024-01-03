public class ConcreteColleague implements Colleague {
    private Mediator mediator;

    public ConcreteColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Colleague sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague receives message: " + message);
    }
}
