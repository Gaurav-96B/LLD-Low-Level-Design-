interface Logger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    void setNextLogger(Logger nextLogger);
    void logMessage(int level, String message);
}
