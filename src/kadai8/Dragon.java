package kadai8;

public class Dragon extends Actor {

	public Dragon() {
		super();
	}

	public Dragon(int hp, int attack) {
		super.setName("ドラゴン");
		super.setHp(hp);
		super.setMaxHp(hp);
		super.setAttack(attack);
	}
	
	public void attack(Actor target) {
		int hp;

		hp = target.getHp() - super.getAttack();
		if (hp < 0) {
			hp = 0;
		}

		target.setHp(hp);

		System.out.println(super.getName() + "のブレス！");
		System.out.println("　" + target.getName() + "に" + super.getAttack() + "のダメージを与えた！");
	}

}
