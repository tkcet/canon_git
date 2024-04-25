package kadai6;

public class BookAction2 {

	public static void main(String[] args) {
		Item[] items = { new Item("ロボット掃除機", 50000), new Book("鬼滅の包丁", 450, "GO峠こよはる"),
				new Book("1ピース", 500, "尾田A―郎") };
		
		for(Item data:items) {
			data.showInfo();
		}
	}

}
