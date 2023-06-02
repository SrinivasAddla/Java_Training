package simpleLibrarySystem;

public class AddPatron extends Books
{
	public void addPatron() 
	{
			if (patronCount >= MAX_PATRONS) {
			    System.out.println("Cannot add more patrons. Maximum limit reached.");
			    return;
			}
			
        System.out.print("Enter the patron name: ");
        String patronName = scanner.next();
        patrons[patronCount] = patronName;
        patronCount++;

        System.out.println("Patron added successfully!");
    }
}
