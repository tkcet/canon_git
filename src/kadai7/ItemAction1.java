package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction1 {

	public static void main(String[] args) {
		List<Item> itemList = new ArrayList<>();

		itemList.add(new Item("ロボット掃除機", 50000));
		itemList.add(new Item("ドラム式洗濯機", 200000));
		itemList.add(new Item("液晶テレビ", 100000));

		for (Item data : itemList) {
			data.showInfo();
			System.out.println("---");
		}
	}

}
