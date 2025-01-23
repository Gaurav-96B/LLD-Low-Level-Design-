class HasCardState implements ATMState {
    private ATM atm;

    public HasCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("A card is already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atm.setState(new NoCardState(atm));
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("PIN accepted. You can now withdraw cash.");
            atm.setState(new AuthenticatedState(atm));
        } else {
            System.out.println("Invalid PIN. Try again.");
        }
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Enter PIN first.");
    }
}
