public interface Mediator {
    void sendMessage(String message, Colleague colleague);
    void addUser(Colleague colleague);

}
