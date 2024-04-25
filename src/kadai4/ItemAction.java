package kadai4;

public class ItemAction {

	public static void main(String[] args) {
		Item item1 = new Item();

		item1.name = "絵本";
		item1.price = 1000;

		System.out.println("名前：" + item1.name);
		System.out.println("価格：" + item1.price + "円");

		System.out.println("---");

		Item item2 = new Item();

		item2.name = "シャンプー";
		item2.price = 222;
		item2.showInfo();
	}

}
