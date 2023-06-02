package simpleLibrarySystem;

public class AddPatron extends Books
{
	public void addPatron() 
	{
      String patronName = null;
		try {
			if (patronCount >= MAX_PATRONS) {
			    System.out.println("Cannot add more patrons. Maximum limit reached.");
			    return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.print("Enter the patron name: ");
        try
        {
        patronName = scanner.nextLine();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        patrons[patronCount] = patronName;
        patronCount++;

        System.out.println("Patron added successfully!");
    }
}
