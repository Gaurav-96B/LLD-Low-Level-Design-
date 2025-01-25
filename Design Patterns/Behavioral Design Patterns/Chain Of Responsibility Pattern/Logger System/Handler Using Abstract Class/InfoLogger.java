class InfoLogger extends Logger {
    public InfoLogger() {
        this.logLevel = Logger.INFO;
    }

    public void logMessage(int level, String message) {
        if (this.logLevel <= level) {
            System.out.println("INFO: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
