class DebugLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void logMessage(int level, String message) {
        if (level == DEBUG) {
            System.out.println("DEBUG: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
