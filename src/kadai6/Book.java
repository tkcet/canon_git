package kadai6;

public class Book extends Item {
	private String author;

	Book() {

	}

	Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	void showInfo() {
		super.showInfo();
		System.out.println("著者：" + this.author);
	}
}
