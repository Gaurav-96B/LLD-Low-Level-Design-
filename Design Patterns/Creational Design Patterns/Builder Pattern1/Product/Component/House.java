public class House {
    private String windows;
    private String doors;
    private String roof;
    private String garage;

    // Private constructor to prevent direct object creation
    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.roof = builder.roof;
        this.garage = builder.garage;
    }

    @Override
    public String toString() {
        return "House with " +
               "windows: " + windows + 
               ", doors: " + doors + 
               ", roof: " + roof + 
               ", garage: " + garage;
    }

    // Static inner class for building the House
    public static class HouseBuilder {
        private String windows;
        private String doors;
        private String roof;
        private String garage;

        // Builder methods to set values and return the builder itself for chaining
        public HouseBuilder setWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setGarage(String garage) {
            this.garage = garage;
            return this;
        }

        // Build method to return the final constructed object
        public House build() {
            return new House(this);
        }
    }
}
