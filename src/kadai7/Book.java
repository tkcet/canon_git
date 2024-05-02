package kadai7;

public class Book extends Item {
	private String author;

	public Book() {

	}

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("著者：" + this.author);
	}
}
