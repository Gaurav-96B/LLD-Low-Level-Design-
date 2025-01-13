class GreenLightState implements TrafficLightState{
    public void displayLight(){
        System.out.println("Traffic light is green. GO!");
    }
    public void next(TrafficLight trafficLight){
        System.out.println("Switching from GREEN to YELLOW.");
        trafficLight.setState(new YellowLightState());
    }
}
