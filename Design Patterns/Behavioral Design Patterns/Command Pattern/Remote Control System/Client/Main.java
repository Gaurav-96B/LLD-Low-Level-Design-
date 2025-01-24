public class Main {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Commands
        Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLight = new TurnOffLightCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Set command and press the button for turning on the light
        remote.setCommand(turnOnLight);
        remote.pressButton();

        // Set command and press the button for turning off the light
        remote.setCommand(turnOffLight);
        remote.pressButton();
    }
}
