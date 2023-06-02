package simpleLibrarySystem;

public class AddBook extends Books
{
	public void addBook() 
	{
		scanner.nextLine();
		if (bookCount >= MAX_BOOKS) {
            System.out.println("Cannot add more books. Maximum limit reached.");
            return;
        }
		
        System.out.print("Enter the book title: ");
        String title = scanner.next();
        System.out.print("Enter the author: ");
        String author = scanner.next();

        books[bookCount] = title;
        authors[bookCount] = author;
        bookCount++;

        System.out.println("Book added successfully!\n");
    }
	
}
