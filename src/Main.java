public class Main {
    public static void main(String[] args) {

BankAccount bank = new BankAccount();
bank.deposit(20000.0);
        while (true) {
            try {
                bank.withDraw(6000);
            } catch (LimitException ie) {
                try {
                    bank.withDraw((int) ie.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;

            }
        }
    }
}
