public interface Handler {
    void setNextHandler(Logger nextHandler);
    void logMessage(Request request,String msg);
    void displayLogInfo(String msg);
}
