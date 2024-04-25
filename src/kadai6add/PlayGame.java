package kadai6add;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Human[] party = new Human[3];
		int select;

		System.out.println("===パーティを作成します===");
		for (int i = 0; i < party.length; i++) {
			System.out.print("どちら（1:市民 2:戦士）を作成しますか：");
			select = scan.nextInt();
			if (select == 1) {
				System.out.print("名前：");
				String name = scan.next();
				party[i] = new Human(name);
			} else if (select == 2) {
				System.out.print("名前：");
				String name = scan.next();
				System.out.print("種別：");
				String type = scan.next();
				Human data = new Warrior(name, type);
				party[i] = data;

			} else {
				System.out.println("入力が違います");
				i--;
			}
		}
		System.out.println("===パーティを作成しました===");

		do {
			System.out.print("操作（1:一覧表示 2:攻撃 9:終了）を選択してください：");
			select = scan.nextInt();
			if (select == 1) {
				for (Human data : party) {
					data.info();
				}
			} else if (select == 2) {
				for (Human data : party) {
					data.attack();
				}

			} else if (select != 9) {
				System.out.println("入力が違います");
			}
		} while (select != 9);

	}

}
