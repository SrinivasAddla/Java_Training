package simpleLibrarySystem;

import java.util.Scanner;

public class Books 
{
	public static final int MAX_BOOKS = 5;
    public static final int MAX_PATRONS = 5;
    public static String[] books = new String[MAX_BOOKS];
    public static String[] authors = new String[MAX_BOOKS];
    public static String[] patrons = new String[MAX_PATRONS];
    public static String[] borrowedBooks = new String[MAX_PATRONS];
    public static int bookCount = 0;
    public static int patronCount = 0;
    public static Scanner scanner = new Scanner(System.in);
    
    //main method
    public static void main(String[] args) 
    {
      
    	AddBook addbook = new AddBook();
    	AddPatron addpatron = new AddPatron();
    	BorrowBook brrBook = new BorrowBook();
    	ReturnBook rtnBook = new ReturnBook();
        boolean exit = false;

        while (!exit) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Patron");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                	addbook.addBook();
                    break;
                case 2:
                	addpatron.addPatron();
                    break;
                case 3:
                	brrBook.borrowBook();
                    break;
                case 4:
                	rtnBook.returnBook();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
