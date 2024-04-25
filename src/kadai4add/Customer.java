package kadai4add;

public class Customer {

	int id;
	String name;

	public void setData(String Name) {

		id = 0;
		name = Name;

	}

	public void setData(int Id, String Name) {

		id = Id;
		name = Name;

	}

	public void showData() {
		System.out.println(id + "：" + name);
	}

}
