public interface Handler {
    void setNextHandler(Handler nextHandler);
    void logMessage(Request request);
    void displayLogInfo(String msg);
}
