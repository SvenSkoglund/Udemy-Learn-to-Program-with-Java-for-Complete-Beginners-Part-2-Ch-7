/*  create an array of five books. In a loop, prompt the user for name, price, stock
count, and type of book (hardback or paperback). Add a method printInventory() that
takes one parameter: an array of Books. The printInventory() method should loop, calling
printBook() for each book in the array. */

package src;

import java.util.Scanner;
import src.book;
public class BookType {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

				
		book [] book1  = new book[5];
		
		// This loop prompts for the information of all the books and stores them in a book class
		int i = 0 ;
		for (i = 0 ; i < 5 ; i++)
		{

			//Prompt and store title
			System.out.print("Please enter book " + (i+1) + " title (No Spaces): ");
			String title = scanner.next();
						
			//Prompt and store price
			System.out.print("Please enter book " + (i+1) + " price: ");
			float price = scanner.nextFloat();
			
			//Prompt and store inventory
			System.out.print("Please enter book " + (i+1) + " inventory: ");
			int inventory = scanner.nextInt();
			
			//Prompt and store Hardback true or false
			System.out.print("Enter 'H' for hardcover or 'P' for paperback: ");
			String type = scanner.next();      
			boolean hard = false;
			if (type.charAt(0) == 'H' || type.charAt(0) == 'h')
				hard = true;
						
			//Declares a new book where the input will be stored
			book book2 = new book();
			book2.name = title;
			book2.price = price;
			book2.inventory = inventory;
			book2.hardback = hard;
			
			//Stores the new book in array at index i
			book1[i] = book2;
	
		}
		
			//Closes the scanner and prints the book
		scanner.close();

			printInventory(book1);
		
	}
	
	// This method prints an array of books using method printbook in a loop
	public static void printInventory (src.book book1[])
	{
		System.out.println("Type\t" + "Title\t" + "Price\t" + " Inventory");
		int i;
		for ( i = 0 ; i < book1.length ; i++)
		{
			printBook(book1[i]);
		}
	}
	
	// This method prints the information stored in one book
	public static void printBook(src.book book2)
	{
		if (book2.hardback)
		{
			System.out.print("Hard:\t");
		}
		else
		{
			System.out.print("Paper:\t");
		}

		System.out.print(book2.name + "\t");
		System.out.print(book2.price + "\t");
		System.out.println(book2.inventory + "\t");


	}

}
