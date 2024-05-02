package exam06;

public class Engineer extends Employee {
	private String skill;

	public Engineer() {
		super();
	}

	public Engineer(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void introduce() {
		super.introduce();
		System.out.println(skill + "エンジニアです");
	}
}
