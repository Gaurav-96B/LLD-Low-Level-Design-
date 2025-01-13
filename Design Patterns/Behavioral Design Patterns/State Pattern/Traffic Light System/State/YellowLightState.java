class YellowLightState implements TrafficLightState{
   public void displayLight(){
       System.out.println("Traffic light is yellow. SLOW DOWN!");
   } 
   public void next(TrafficLight trafficLight){
       System.out.println("Switching from YELLOW to RED.");
       trafficLight.setState(new RedLightState());
   }
}
