class DebugLogger extends Logger {
    public DebugLogger() {
        this.logLevel = Logger.DEBUG;
    }

   public void logMessage(int level, String message) {
        if (this.logLevel <= level) {
            System.out.println("DEBUG: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
