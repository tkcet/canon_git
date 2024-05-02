package kadai7add;

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

	public String getAuthor() {
		return author;
	}

	public String getInfo() {
		String str = "";

		str = super.getName() + "(著：" + this.author + ")/" + super.getPrice() + "円";

		return (str);
	}
}
