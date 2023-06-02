package bankApplication;

public class Atm
{
	private double balance;

    public Atm() {
        balance = 0;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount, int pin) {
        if (amount > 0 && pin!=0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount, int pin ) {
    	
        if (amount > balance ) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount<balance && pin!=0){
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }
}
