package kadai5;

public class Item {

	private String name;
	private int price;

	Item(String Name, int Price) {
		name = Name;
		price = Price;
	}

	void setName(String Name) {
		name = Name;
	}

	void setPrice(int Price) {
		price = Price;
	}

	String getName() {

		return (name);

	}

	public int getPrice() {

		return (price);

	}

	public void showInfo() {
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price + "円");
	}

}
