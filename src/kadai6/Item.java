package kadai6;

public class Item {

	private String name;
	private int price;

	Item() {

	}

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

	int getPrice() {
		return (price);
	}

	void showInfo() {
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price + "円");
	}

}
