package kadai8;

public class Hero extends Actor {

	Hero() {
		super();
	}

	Hero(int hp, int attack) {
		super.setName("勇者");
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

		System.out.println(super.getName() + "は剣で切りつけた");
		System.out.println("　" + target.getName() + "に" + super.getAttack() + "のダメージを与えた！");

	}
}
