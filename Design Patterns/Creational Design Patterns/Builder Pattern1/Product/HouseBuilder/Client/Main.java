public class Main {
    public static void main(String[] args) {
        // Building a house with only windows and doors
        House house1 = new House.HouseBuilder()
                            .setWindows("4 Windows")
                            .setDoors("2 Doors")
                            .build();
        
        // Building a house with windows, doors, and a roof
        House house2 = new House.HouseBuilder()
                            .setWindows("6 Windows")
                            .setDoors("3 Doors")
                            .setRoof("Concrete Roof")
                            .build();

        // Building a fully-featured house
        House house3 = new House.HouseBuilder()
                            .setWindows("8 Windows")
                            .setDoors("4 Doors")
                            .setRoof("Metal Roof")
                            .setGarage("2-Car Garage")
                            .build();

        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
    }
}
