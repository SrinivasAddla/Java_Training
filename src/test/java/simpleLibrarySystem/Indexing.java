package simpleLibrarySystem;

public class Indexing extends Books
{
	public static int findBookIndex(String bookTitle) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(bookTitle)) {
                return i;
            }else {
            	if (borrowedBooks[i] != null && borrowedBooks[i].equalsIgnoreCase(bookTitle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int findPatronIndex(String patronName) {
        for (int i = 0; i < patronCount; i++) {
            if (patrons[i].equalsIgnoreCase(patronName)) {
                return i;
            }
        }
        return -1;
    }
}
