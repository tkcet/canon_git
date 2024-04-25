package kadai5add;

public class Customer {

	private int id;
	private String name;

	Customer() {
		id = 0;
		name = "";
	}

	Customer(String Name) {
		name = Name;
	}

	Customer(int Id, String Name) {
		id = Id;
		name = Name;
	}

	public int getId() {

		return (id);
	}

	public void setId(int Id) {
		id = Id;
	}

	public void setName(String Name) {
		name = Name;
	}

	public void showData() {
		System.out.println(id + "：" + name);
	}

}
