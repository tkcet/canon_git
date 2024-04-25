package kadai5;

public class ItemAction2 {

	public static void main(String[] args) {
		Item[] items = {new Item("ロボット掃除機",50000),new Item("空気清浄機",20000),new Item("扇風機",4000)};
		/*
		//Item[] items = {new Item("",0),new Item("",0),new Item("",0)};
		Item[] items = new Item[3];
		//Item item = new Item("", 0);
		//Item item = new Item();

		for (int i = 0; i < 3; i++) {
			Item item = new Item();
			if (i == 0) {
				item.setName("ロボット掃除機");
				item.setPrice(50000);
				items[i] = item;
				//items[0].setName(item.getName());
				//items[0].setPrice(item.getPrice());
			}

			if (i == 1) {
				item.setName("空気清浄機");
				item.setPrice(20000);
				items[i] = item;
				//items[1].setName(item.getName());
				//items[1].setPrice(item.getPrice());
			}

			if (i == 2) {
				item.setName("扇風機");
				item.setPrice(4000);
				items[i] = item;
				//items[2].setName(item.getName());
				//items[2].setPrice(item.getPrice());
			}

		}

		*/
		for (Item data : items) {
			data.showInfo();
			System.out.println("---");
		}

	}

}
