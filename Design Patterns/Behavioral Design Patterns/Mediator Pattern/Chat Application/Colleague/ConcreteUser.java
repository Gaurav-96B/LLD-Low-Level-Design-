class ConcreteUser implements User {
    private String name;
    private ChatMediator mediator;

    public ConcreteUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);  // Send the message through the mediator
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}
