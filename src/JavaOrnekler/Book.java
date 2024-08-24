package JavaOrnekler;

public class Book {
	private String name, author, publisher;
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

	public int getNumberOfPage() {// Dışarıdan erişmek için
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {// Dışarıdan değişiklik yapmak için
		if (numberOfPage < 1) {
			System.out.println("Sayfa sayısı negatif olamaz");
			this.numberOfPage = 10;
		} else {
			this.numberOfPage = numberOfPage;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
