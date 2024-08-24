package JavaOrnekler;

public class Book {
	public String name, author, publisher;
	private int numberOfPage;

	Book(String name, int numberOfPage, String author, String publisher) {
		this.name = name;
		if (numberOfPage < 1) {
			this.numberOfPage = 10;
		} else {
			this.numberOfPage = numberOfPage;
		}
		this.author = author;
		this.publisher = publisher;
	}

	public void pageSize() {
		System.out.println(numberOfPage);
	}
}
