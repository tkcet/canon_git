package kadai8;

public class Zombie extends Actor {
	Zombie() {
		super();
	}

	Zombie(int hp, int attack) {
		super.setName("ゾンビ");
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

		System.out.println(super.getName() + "の体当たり");
		System.out.println("　" + target.getName() + "に" + super.getAttack() + "のダメージを与えた！");

	}

}
