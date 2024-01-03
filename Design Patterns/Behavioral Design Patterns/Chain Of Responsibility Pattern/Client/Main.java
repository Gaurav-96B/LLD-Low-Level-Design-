public class Client {
    public static void main(String[] args) {
         Logger chainLogger= doChaining();  

         Request request1 = new Request("OUTPUTINFO");
         Request request2 = new Request("ERRORINFO");
         Request request3 = new Request("DEBUGINFO");
        
         chainLogger.logMessage(request1, "Enter the sequence of values ");  
         chainLogger.logMessage(request2, "An error is occured now");  
         chainLogger.logMessage(request3, "This was the error now debugging is compeled"
    }
    private static Logger doChaining(){  
          Logger consoleLogger = new ConsoleBasedLogger(Level.OUTPUTINFO);  
            
          Logger errorLogger = new ErrorBasedLogger(Level.ERRORINFO);  
          consoleLogger.setNextLevelLogger(errorLogger);  
            
          Logger debugLogger = new DebugBasedLogger(Level.DEBUGINFO);  
          errorLogger.setNextLevelLogger(debugLogger);  
            
          return consoleLogger;   
          }  
}
