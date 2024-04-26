package kadai8;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int defeat = 0;
		System.out.println("★★★ゲーム開始★★★");
		// 勇者の生成
		Actor hero = new Hero(50, 10);
		hero.status();
		partition();
		while ((0 <= defeat) && (defeat < 3)) {
			// 敵の生成
			Actor enemy0 = new Actor();
			Actor enemy = enemy0.randomEnemy();
			enemy.status();
			partition();

			// バトル
			defeat = defeat + battle(hero, enemy);

			if (defeat < 0) {
				System.out.println("★★★ゲームオーバー★★★");
			}
		}
		if (defeat > 0) {
			System.out.println("全ての敵を倒した！");
			partition();
			Actor dragon = new Dragon(200, 30);
			System.out.println("ドラゴンが現われた！");
			defeat = battle(hero, dragon);
		}
		if (defeat > 0) {
			System.out.println("★★★ゲーム終了★★★");
		} else {
			System.out.println("★★★ゲームオーバー★★★");
		}
		scan.close();
	}

	static void partition() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("待機処理でエラーが発生しました");
			e.printStackTrace();
		}
		System.out.println("---------------------------------------------");
	}

	static int battle(Actor player, Actor charactor) {
		Scanner scan = new Scanner(System.in);
		int select;
		int defeat = 0;
		while (true) {
			// 勇者の攻撃
			if (player.getHp() != 0) {
				for (;;) {
					System.out.println("どうしますか？");
					System.out.print("　[1]攻撃 [2]回復 [3]逃げる：");
					select = scan.nextInt();
					if (select == 1) {
						partition();
						player.attack(charactor);
						charactor.status();
						partition();
						break;
					} else if (select == 2) {
						partition();
						player.heal();
						player.status();
						partition();
						break;
					} else if (select == 3) {
						System.out.println("勇者は逃げ出した！");
						partition();
						break;
					} else {
						System.out.println("1～3を入力してください");
						partition();
					}
				}
			} else {
				System.out.println("勇者はやられてしまった…");
				partition();
				partition();
				defeat = -10;
				break;
			}
			if (select == 3) {
				break;
			}

			// 敵の攻撃
			if (charactor.getHp() != 0) {
				charactor.attack(player);
				player.status();
				partition();
			} else {
				System.out.println(charactor.getName() + "を倒した");
				defeat = 1;
				partition();
				partition();
				break;
			}
		}
		return defeat;
	}

}
/*
while (true) {
	// 勇者の攻撃
	if (hero.getHp() != 0) {
		for (;;) {
			System.out.println("どうしますか？");
			System.out.print("　[1]攻撃 [2]回復 [3]逃げる：");
			select = scan.nextInt();
			if (select == 1) {
				partition();
				hero.attack(enemy);
				enemy.status();
				partition();
				break;
			} else if (select == 2) {
				partition();
				hero.heal();
				hero.status();
				partition();
				break;
			} else if (select == 3) {
				System.out.println("勇者は逃げ出した！");
				partition();
				break;
			} else {
				System.out.println("1～3を入力してください");
				partition();
			}
		}
	} else {
		System.out.println("勇者はやられてしまった…");
		partition();
		partition();
		end = 0;
		break;
	}
	if (select == 3) {
		break;
	}

	// 敵の攻撃
	if (enemy.getHp() != 0) {
		enemy.attack(hero);
		hero.status();
		partition();
	} else {
		System.out.println(enemy.getName() + "を倒した");
		defeat++;
		partition();
		partition();
		end = 1;
		break;
	}
}
*/
/*
if (end == 0) {
	System.out.println("★★★ゲームオーバー★★★");
}
*/