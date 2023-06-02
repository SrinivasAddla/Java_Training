package simpleLibrarySystem;

public class BorrowBook extends Books
{
	static Indexing index = new Indexing();
	
	public void borrowBook()
	{
        System.out.println("Enter the patron name: ");
//        scanner.nextLine();
        String patronName = scanner.nextLine();

        int patronIndex = index.findPatronIndex(patronName);

        if (patronIndex == -1) {
            System.out.println("Patron not found.");
            return;
        }

        if (borrowedBooks[patronIndex] != null) {
            System.out.println("Patron already borrowed a book.");
            return;
        }

        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();

        int bookIndex = index.findBookIndex(bookTitle);

        if (bookIndex == -1) {
            System.out.println("Book not found.");
            return;
        }

        if (books[bookIndex] == null) {
            System.out.println("Book is not available for borrowing.");
            return;
        }

        books[bookIndex] = null;
        borrowedBooks[patronIndex] = bookTitle;

        System.out.println("Book borrowed successfully!");
    }
}
