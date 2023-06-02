package bankApplication;

public class MultiAccount 
{
	int[] accnumbers;
	int accountNum=1000;
	int acc_Count;
	public MultiAccount() 
	{
		 accnumbers = new int[1000];
		 acc_Count=0;
	}

	public void createAccount(int accountNumber, int pin) {
		if (pin != 0 && accountNumber != 0) {
			System.out.println("Account created successfully-------");
			accountNum = accountNum + 1;
			System.out.println("user accountnumber is: " + accountNum);
		} else {
			System.out.println("Account not created, Please try again with valid information---------");
		}
	}
	
	 public void loginAccount(int AccountNum, int pin ) {
	    	if(AccountNum!=0 && pin!=0) {    		
	    System.out.println("Login Successfull------");
	    	}
	    	else {
	      System.out.println("Please enter valid Credentials----------");
	    	}
	    }
}
