package kadai7add;

public class Item {
	private String name;
	private int price;

	public Item() {

	}

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		String str = "";

		str = this.name + "/" + this.price + "円";

		return (str);
	}
}
