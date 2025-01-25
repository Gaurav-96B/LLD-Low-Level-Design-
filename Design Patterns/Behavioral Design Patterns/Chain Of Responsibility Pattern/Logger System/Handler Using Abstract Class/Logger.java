abstract class Logger {
    protected Logger nextLogger;
    protected int logLevel;
    
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // Process the log request
    protected abstract void logMessage(int level, String message);
    
}
