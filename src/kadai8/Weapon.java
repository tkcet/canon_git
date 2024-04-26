package kadai8;

import java.util.Scanner;

public class Weapon {
	private String weapon;
	private int attackWeapon;

	public Weapon(String weapon, int attackWeapon) {
		this.weapon = weapon;
		this.attackWeapon = attackWeapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getAttackWeapon() {
		return attackWeapon;
	}

	public void setAttackWeapon(int attackWeapon) {
		this.attackWeapon = attackWeapon;
	}

	public void setWeapon() {
		Scanner scan = new Scanner(System.in);

		System.out.print("　[1]剣 [2]槍 [3]弓：");
		int select = scan.nextInt();

		switch (select) {
		case 1:
			this.weapon = "剣";
			this.attackWeapon = 50;
			break;
		case 2:
			this.weapon = "槍";
			this.attackWeapon = 30;
			break;
		case 3:
			this.weapon = "弓";
			this.attackWeapon = 10;
			break;
		default:
			break;
		}

		scan.close();
	}
}
