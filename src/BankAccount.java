public class BankAccount {

    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
        System.out.println("Deposit money to the account " + sum);

    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("There are not enough funds in your account: ", amount);
        } else {
            System.out.println("You can withdraw from the account: " + sum);
            amount -= sum;
            System.out.println("You have withdrawn from the account: " + sum);

        }
    }
}