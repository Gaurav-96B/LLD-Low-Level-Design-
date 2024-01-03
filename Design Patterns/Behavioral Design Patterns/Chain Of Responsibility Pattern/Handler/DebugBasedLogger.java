public class DebugBasedLogger extends Logger {  

    private Logger nextLevelLogger; 
    private int levels;  
  
    public DebugBasedLogger(int levels) {  
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
        System.out.println("DEBUG LOGGER INFO: "+msg);  
    }  
}  
