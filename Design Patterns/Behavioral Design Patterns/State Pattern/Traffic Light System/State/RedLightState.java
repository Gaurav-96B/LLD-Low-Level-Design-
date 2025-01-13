class RedLightState implements TrafficLightState{
    public void displayLight(){
        System.out.println("Traffic light is red. STOP!");
    }
    public void next(TrafficLight trafficLight){
        System.out.println("Switching from RED to GREEN.");
        trafficLight.setState(new GreenLightState());
    }
}
