public class ConsoleBasedLogger extends Logger {  

    private Logger nextLevelLogger; 
    private String levels;  
  
    public ConsoleBasedLogger(String levels) {  
        this.levels=levels;  
    }  
    
    public void setNextLevelLogger(Logger nextLevelLogger) {  
        this.nextLevelLogger = nextLevelLogger;  
    }  
        
    public void logMessage(Request request, String msg){  
        if(this.levels<=request.getType()){  
            displayLogInfo(msg);  
        }  
        if (nextLevelLogger!=null) {  
            nextLevelLogger.logMessage(request, msg);  
        }  
    }  
    public void displayLogInfo(String msg) {  
        System.out.println("CONSOLE LOGGER INFO: "+msg);  
    }  
}  
