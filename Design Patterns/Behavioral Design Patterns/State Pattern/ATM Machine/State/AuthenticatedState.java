class AuthenticatedState implements ATMState {
    private ATM atm;

    public AuthenticatedState(ATM atm) {
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
        System.out.println("You are already authenticated.");
    }

    @Override
    public void withdrawCash(int amount) {
        if (amount <= atm.getCash()) {
            System.out.println("Dispensing $" + amount);
            atm.setCash(atm.getCash() - amount);

            if (atm.getCash() == 0) {
                atm.setState(new OutOfCashState(atm));
            } else {
                atm.setState(new NoCardState(atm));
            }
        } else {
            System.out.println("Insufficient cash in the ATM.");
        }
    }
}
