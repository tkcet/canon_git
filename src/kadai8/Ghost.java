package kadai8;

public class Ghost extends Actor {
	Ghost() {
		super();
	}

	Ghost(int hp, int attack) {
		super.setName("ゴースト");
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

		System.out.println(super.getName() + "の叫び声！");
		System.out.println("　" + target.getName() + "に" + super.getAttack() + "のダメージを与えた！");

	}

}
