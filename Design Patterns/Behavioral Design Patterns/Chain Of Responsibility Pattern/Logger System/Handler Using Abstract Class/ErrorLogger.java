class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.logLevel = Logger.ERROR;
    }

   public void logMessage(int level, String message) {
        if (this.logLevel <= level) {
            System.out.println("ERROR: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
