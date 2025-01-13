class TrafficLight{
    private TrafficLightState currentState;
  
    public TrafficLight(){
        this.currentState=new RedLightState(); //intial state
    }
    
    public void setState(TrafficLightState trafficLightState){
        this.currentState=trafficLightState;
    }
    
    public void next(){
        currentState.next(this);
    }
    
    public void display(){
        currentState.displayLight();
    }
}
