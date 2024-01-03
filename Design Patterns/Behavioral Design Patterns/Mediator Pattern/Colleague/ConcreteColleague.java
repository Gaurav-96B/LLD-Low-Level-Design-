public class ConcreteColleague implements Colleague {
	private Mediator mediator;
	private String name;
	
        public ConcreteColleague(Mediator med, String name) {
		this.mediator=med;
		this.name=name;
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
