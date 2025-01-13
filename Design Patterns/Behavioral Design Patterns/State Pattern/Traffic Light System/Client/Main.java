class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight();

        // Simulate traffic light transitions
        for (int i = 0; i < 6; i++) {
            trafficLight.display();
            trafficLight.next();
        }
    }
}
