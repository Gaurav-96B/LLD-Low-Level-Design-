class Computer {
    // Required parameters
    private String processor;
    private int ram;

    // Optional parameters
    private boolean hasGraphicsCard;
    private boolean hasBluetooth;

    private Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return this.processor+" "+this.ram+" "+this.hasGraphicsCard+" "+this.hasBluetooth;
    }

    // Builder Class
    public static class ComputerBuilder {
        // Required parameters
        private String processor;
        private int ram;

        // Optional parameters
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;

        public ComputerBuilder(String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

class Main {
    public static void main(String[] args) {
       // Creating a Computer with the Builder
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", 32)
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        Computer officeComputer = new Computer.ComputerBuilder("Intel i5", 16)
                .setBluetooth(true)
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
       

       
    }
}
