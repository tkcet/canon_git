package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction2 {

	public static void main(String[] args) {
		List<Item> itemList = new ArrayList<>();

		itemList.add(new Item("ロボット掃除機", 50000));
		itemList.add(new Book("鬼滅の包丁", 500, "Go峠"));
		itemList.add(new Book("1ピース", 500, "小田"));

		for (Item data : itemList) {
			data.showInfo();
			System.out.println("---");
		}
	}

}
