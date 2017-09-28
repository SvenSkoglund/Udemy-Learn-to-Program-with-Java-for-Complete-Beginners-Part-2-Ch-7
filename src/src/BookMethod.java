package src;

public class BookMethod {

	public static void main(String[] args) 
	{
		src.book book1 = new src.book();
		
		book1.name = "Harry Potter";
		book1.price = 25.99f;
		book1.inventory = 20;
		printBook(book1);
			
	}
	
	
	public static void printBook(src.book newBook)
	{
		System.out.println(newBook.name);
		System.out.println(newBook.price);
		System.out.println(newBook.inventory);


	}

}
