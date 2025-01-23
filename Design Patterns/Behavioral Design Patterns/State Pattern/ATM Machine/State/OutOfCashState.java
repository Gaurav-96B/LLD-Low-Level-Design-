class OutOfCashState implements ATMState {
    private ATMContext atm;

    public OutOfCashState(ATMContext atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM is out of cash. Try another machine.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("ATM is out of cash. Try another machine.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("ATM is out of cash. Try another machine.");
    }
}
