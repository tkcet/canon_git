package kadai8;

import java.util.Random;

public class Actor {

	// フィールド
	private String name; // 名前
	private int hp; // 生命力
	private int maxHp; // 最大生命力
	private int attack; // 攻撃力
	private int defense; // 防御力

	// コンストラクタ
	Actor() {

	}

	Actor(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public String toString() {
		String info = "";
		String strHp = String.valueOf(this.hp);
		String strMaxHp = String.valueOf(this.maxHp);

		info = this.name + "（HP：" + strHp + "/" + strMaxHp + "）";

		return (info);
	}

	public void status() {
		StringBuffer barHp = new StringBuffer();
		barHp.append(Character.toChars(9608));
		System.out.println(this.toString());
		System.out.print("[ ");
		for (int i = 0; i < this.getHp() / 5; i++) {
			System.out.print(barHp.toString() + " ");
		}
		for (int i = 0; i < (this.getMaxHp() - this.getHp()) / 5; i++) {
			System.out.print(" ");
		}
		System.out.print("]\n");
	}

	public void attack(Actor target) {
		int hp;

		hp = target.getHp() - this.attack;
		if (hp < 0) {
			hp = 0;
		}

		target.setHp(hp);

		System.out.println(this.name + "の攻撃");
		System.out.println("　" + target.getName() + "に" + this.attack + "のダメージを与えた！");
	}

	public void heal() {
		int healHp = this.maxHp / 2;

		this.hp += healHp;

		if (this.hp > this.maxHp) {
			this.hp = this.maxHp;
		}
	}

	public Actor randomEnemy() {
		Actor charactor;
		Random random = new Random();
		int randomInt = random.nextInt(3);

		if (randomInt == 0) {
			charactor = new Zombie(10, 5, 0);
		} else if (randomInt == 1) {
			charactor = new Zombie(20, 10, 0);
		} else {
			charactor = new Ghost(30, 15, 0);
		}

		return (charactor);
	}
}
