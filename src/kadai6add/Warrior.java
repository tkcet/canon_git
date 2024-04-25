package kadai6add;

public class Warrior extends Human {
	private String type;

	Warrior() {

	}

	Warrior(String name, String type) {
		super(name);
		this.type = type;
	}

	void setType(String type) {
		super.setName(this.getName());
		this.type = type;
	}

	void info() {
		System.out.println("種別：" + type + "　名前：" + this.getName());
	}

	void attack() {
		System.out.println("「" + type + "」は攻撃した");
	}
}
