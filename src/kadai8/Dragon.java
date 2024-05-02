package kadai8;

public class Dragon extends Actor {

	public Dragon() {
		super();
	}

	public Dragon(int hp, int attack, int defense) {
		super("ドラゴン", hp, attack, defense);
		super.setMaxHp(hp);
	}

	public void attack(Actor target) {
		int hp;
		int damage;

		damage = super.getAttack() - target.getDefense();
		if (damage < 0) {
			damage = 0;
		}
		hp = target.getHp() - damage;
		if (hp < 0) {
			hp = 0;
		}

		target.setHp(hp);

		System.out.println(super.getName() + "のブレス！");
		System.out.println("　" + target.getName() + "に" + damage + "のダメージを与えた！");
	}

}
