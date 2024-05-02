package kadai8;

public class Hero extends Actor {
	private String weapon;
	private int attackWeapon;

	Hero() {
		super();
	}

	Hero(int hp, int attack, int defense) {
		super("勇者", hp, attack, defense);
		super.setMaxHp(hp);
	}

	public String getWeapon() {
		return weapon;
	}

	public int getAttackWeapon() {
		return attackWeapon;
	}

	public void setWeapon() {
		System.out.println("武器を装備します");
		Weapon weapon = new Weapon();
		weapon.setWeapon();
		this.weapon = weapon.getWeapon();
		this.attackWeapon = weapon.getAttackWeapon();
	}

	public void attack(Actor target) {
		int hp;
		int damage = super.getAttack();
		//Random random = new Random();
		//int randomInt = random.nextInt(3); // 攻撃が外れる確率

		damage = damage + this.attackWeapon - target.getDefense();
		if (damage < 0) {
			damage = 0;
		}
		hp = target.getHp() - damage;
		if (hp < 0) {
			hp = 0;
		}

		target.setHp(hp);

		if (this.weapon == "剣") {
			System.out.println(super.getName() + "は" + this.weapon + "で切りつけた");
		} else if (this.weapon == "槍") {
			System.out.println(super.getName() + "は" + this.weapon + "で突き刺した");
		} else {
			System.out.println(super.getName() + "は" + this.weapon + "で打ちぬいた");
		}
		System.out.println("　" + target.getName() + "に" + damage + "のダメージを与えた！");

	}
}
