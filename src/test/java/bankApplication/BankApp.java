package bankApplication;

import java.util.Scanner;

public class BankApp
{
	public static void main(String[] args)
	{
		Atm atm = new Atm();
		MultiAccount multiAccount= new MultiAccount();
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Simple ATM");
            System.out.println("1. Create an Account");
            System.out.println("2. Login Account");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
            
                case 1:
                	System.out.println("Enter Account Number: " );
                    int accountNum= scanner.nextInt();
	                System.out.println("Enter PIN number: ");
	                int Pin= scanner.nextInt();
	                multiAccount.createAccount(accountNum, Pin);
	                break;
                case 2:
                	System.out.println("Enter Account Number: " );
                	int accountNum2= scanner.nextInt();
	            	System.out.println("Enter PIN: ");
	            	Pin= scanner.nextInt();
	            	multiAccount.loginAccount(accountNum2,Pin);
                    break;
                case 3:
                    System.out.println("Current balance: $" + atm.checkBalance());
                    break;
                case 4:
                	System.out.println("Enter PIN number:    ");
                	 Pin= scanner.nextInt();
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount,Pin);
                    break;
                case 5:
                	System.out.println("Enter PIN number:    ");
               	    Pin= scanner.nextInt();
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount,Pin);
                    break;
                	
                case 6:
                    System.out.println("Thanks for using our service");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();

        } while (choice != 6);

        scanner.close();
    }
	
}
