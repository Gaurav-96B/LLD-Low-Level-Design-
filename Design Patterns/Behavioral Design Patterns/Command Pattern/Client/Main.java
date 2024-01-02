public class Main {
    public static void main(String[] args) {
        // Create receiver
        Light light = new Light();

        // Create concrete commands
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Set and press the button for turning on the light
        remote.setCommand(lightOnCommand);
        remote.pressButton();

        // Set and press the button for turning off the light
        remote.setCommand(lightOffCommand);
        remote.pressButton();
    }
}
