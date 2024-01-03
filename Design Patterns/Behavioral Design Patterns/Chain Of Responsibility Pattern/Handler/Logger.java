public interface Handler {
    void setNextHandler(Handler nextHandler);
    void logMessage(Request request);
}
