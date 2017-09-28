package src;

public class BookTest {

	public static void main(String[] args) 
	{
		src.book book1 = new src.book();
		
		book1.name = "Harry Potter";
		book1.price = 25.99f;
		book1.inventory = 20;
		
		System.out.println(book1.name);
		System.out.println(book1.price);
		System.out.println(book1.inventory);

		
	}

}
