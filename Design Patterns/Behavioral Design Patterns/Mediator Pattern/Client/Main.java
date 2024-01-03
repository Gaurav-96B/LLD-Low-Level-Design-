public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
	    
        Colleague colleague1 = new ConcreteColleague(mediator, "Pankaj");
        Colleague colleague2 = new ConcreteColleague(mediator, "Lisa");
        Colleague colleague3 = new ConcreteColleague(mediator, "Saurabh");
        Colleague colleague4 = new ConcreteColleague(mediator, "David");
	    
        mediator.addUser(colleague1);
	mediator.addUser(colleague2);
	mediator.addUser(colleague3);
	mediator.addUser(colleague4);
	    
        colleague1.sendMessage("Hello, colleague2!");
        colleague2.sendMessage("Hi, colleague1!");
    }
}
