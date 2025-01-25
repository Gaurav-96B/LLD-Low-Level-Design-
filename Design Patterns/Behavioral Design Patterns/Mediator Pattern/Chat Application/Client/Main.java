public class Main {
    public static void main(String[] args) {
        // Create the mediator
        ChatMediator mediator = new ConcreteChatMediator();

        // Create users
        User user1 = new ConcreteUser(mediator, "Alice");
        User user2 = new ConcreteUser(mediator, "Bob");
        User user3 = new ConcreteUser(mediator, "Charlie");

        // Register users to the mediator
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // Simulate sending messages
        user1.sendMessage("Hello, Bob!");
        user2.sendMessage("Hi Alice! How are you?");
        user3.sendMessage("Good afternoon Alice and Bob!");

        // Simulate users sending messages
        user2.sendMessage("Hey Charlie!");
    }
}
