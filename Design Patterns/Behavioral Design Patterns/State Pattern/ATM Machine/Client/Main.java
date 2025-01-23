public class Main{
    public static void main(String[] args) {
        ATM atm = new ATM(500);

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(200);

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(300);

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(100);
    }
}
