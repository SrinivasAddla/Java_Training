package simpleLibrarySystem;

public class ReturnBook extends Books
{
	
	static Indexing index = new Indexing();
	
	public void returnBook() 
	{
        System.out.print("Enter the patron name: ");
        scanner.nextLine();
        String patronName = scanner.nextLine();

        int patronIndex = index.findPatronIndex(patronName);

        if (patronIndex == -1) {
            System.out.println("Patron not found.");
            return;
        }

        if (borrowedBooks[patronIndex] == null) {
            System.out.println("Patron has not borrowed any book.");
            return;
        }

        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();

        int bookIndex = index.findBookIndex(bookTitle);

        if (bookIndex == -1) {
            System.out.println("Book not found.");
            return;	
        }

        books[bookIndex] = bookTitle;
        borrowedBooks[patronIndex] = null;

        System.out.println("Book returned successfully!");
    }
}
