class Duck implements Swimming, Flying {
    @Override
    public void swim() {
        System.out.println("The duck swims.");
    }

    @Override
    public void fly() {
        System.out.println("The duck flies.");
    }
}
