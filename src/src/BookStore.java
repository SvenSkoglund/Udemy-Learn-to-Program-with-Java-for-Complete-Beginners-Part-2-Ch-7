package src;

public class BookStore {

	public static void main(String[] args) 
	{
		src.book book1 = new src.book();
		
		book1.hardback = true;
		book1.name = "Harry Potter";
		book1.price = 25.99f;
		book1.inventory = 20;
		printBook(book1);
			
	}
	
	
	public static void printBook(src.book newBook)
	{
		if (newBook.hardback = true)
		{
			System.out.print("Hard: ");
		}
		else
		{
			System.out.print("Paper: ");
		}
			
		System.out.print(newBook.name + " ");
		System.out.print(newBook.price + " ");
		System.out.println(newBook.inventory + " ");


	}

}
