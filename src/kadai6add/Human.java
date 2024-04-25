package kadai6add;

public class Human {
	private String name;

	Human() {

	}

	Human(String name) {
		this.name = name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return (name);
	}

	void info() {
		System.out.println("名前：" + name);
	}

	void attack() {
		System.out.println("攻撃した");
	}
}
