public class ErrorBasedLogger extends Logger {  

    private Logger nextLevelLogger; 
    private String levels;  
  
    public ErrorBasedLogger(String levels) {  
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
        System.out.println( "ERROR LOGGER INFO: +msg);  
    }  
}  
