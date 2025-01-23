class NoCardState implements ATMState {
    private ATM atm;

    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted. Please enter your PIN.");
        atm.setState(new HasCardState(atm));
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Insert a card first.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Insert a card first.");
    }
}
