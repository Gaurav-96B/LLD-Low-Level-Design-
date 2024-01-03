public class ErrorBasedLogger extends Logger {  

    private Logger nextLevelLogger; 
    private int levels;  
  
    public ErrorBasedLogger(int levels) {  
        this.levels=levels;  
    }  
    
    public void setNextLevelLogger(Logger nextLevelLogger) {  
        this.nextLevelLogger = nextLevelLogger;  
    }  
        
    public void logMessage(int levels, String msg){  
        if(this.levels<=levels){  
            displayLogInfo(msg);  
        }  
        if (nextLevelLogger!=null) {  
            nextLevelLogger.logMessage(levels, msg);  
        }  
    }  
    public void displayLogInfo(String msg) {  
        System.out.println( "ERROR LOGGER INFO: +msg);  
    }  
}  
