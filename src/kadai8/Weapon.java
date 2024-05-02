package kadai8;

import java.util.Scanner;

public class Weapon {
	private String weapon;
	private int attackWeapon;

	public Weapon() {

	}

	public Weapon(String weapon, int attackWeapon) {
		this.weapon = weapon;
		this.attackWeapon = attackWeapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public int getAttackWeapon() {
		return attackWeapon;
	}

	public void setWeapon() {
		Scanner scan = new Scanner(System.in);

		System.out.print("　[1]剣 [2]槍 [3]弓：");
		int weaponNum = scan.nextInt();

		switch (weaponNum) {
		case 1:
			this.weapon = "剣";
			this.attackWeapon = 50;
			break;
		case 2:
			this.weapon = "槍";
			this.attackWeapon = 40;
			break;
		case 3:
			this.weapon = "弓";
			this.attackWeapon = 30;
			break;
		default:
			break;
		}
		System.out.println(this.weapon + "を装備した！");
	}
}
