package JavaOrnekler;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter", 400, "Rowling", "Kodlama");
		b1.setNumberOfPage(600);
		System.out.println(b1.getNumberOfPage());

		Book b2 = new Book("Lord Of The", 500, "Peter Jackson", "Kodlama");
		b2.setName("Lord Of The Rings");
		System.out.println(b2.getName());
		
	}

}
