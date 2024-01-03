public interface Handler {
    void setNextHandler(Handler nextHandler);
    void logMessage(Request request,String msg);
    void displayLogInfo(String msg);
}
