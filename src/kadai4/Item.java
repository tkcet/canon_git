package kadai4;

public class Item {

	String name; // 商品名
	int price; // 価格

	public void showInfo() {
		System.out.println("名前：" + name);
		System.out.println("価格（税抜き）：" + price + "円");
		System.out.println("価格（税込み）：" + (int) (price * 1.1) + "円");
	}

}
