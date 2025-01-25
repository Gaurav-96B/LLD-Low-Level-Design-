public class Main {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();

        // Set up the chain
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger; // Start of the chain
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        System.out.println("Logging messages:");
        loggerChain.logMessage(Logger.INFO, "This is an informational message.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug-level message.");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
    }
}
