class ATM {
    private ATMState noCardState;
    private ATMState outOfCashState;

    private ATMState currentState;
    private int cash;

    public ATM(int cash) {
        noCardState = new NoCardState(this);
        outOfCashState = new OutOfCashState(this);
        this.cash = cash;
        currentState = cash > 0 ? noCardState : outOfCashState;
    }

    public void setState(ATMState state) {
        currentState = state;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    // Delegating actions to the current state
    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }
}
