package exam06;

import java.util.Random;
import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);

		int com = r.nextInt(3) + 1;
		int player;

		System.out.println("1：グー、2：チョキ、3：パーから選択してください");
		System.out.print("じゃん、けん、、、：");
		player = scan.nextInt();
		game("あなた", player);
		game("コンピュータ", com);
		result(player, com);

		scan.close();
	}

	static void game(String name, int num) {
		switch (num) {
		case 1:
			System.out.println(name + "はグー！");
			break;
		case 2:
			System.out.println(name + "はチョキ！");
			break;
		case 3:
			System.out.println(name + "はパー！");
			break;
		default:
			break;
		}
	}

	static void result(int player, int com) {
		switch (player) {
		case 1:
			if (com == 1) {
				System.out.println("引き分けでした");
			} else if (com == 2) {
				System.out.println("あなたの勝ち");
			} else {
				System.out.println("あなたの負け");
			}
			break;
		case 2:
			if (com == 1) {
				System.out.println("あなたの負け");
			} else if (com == 2) {
				System.out.println("引き分けでした");
			} else {
				System.out.println("あなたの勝ち");
			}
			break;
		case 3:
			if (com == 1) {
				System.out.println("あなたの勝ち");
			} else if (com == 2) {
				System.out.println("あなたの負け");
			} else {
				System.out.println("引き分けでした");
			}
			break;
		default:
			break;
		}
	}

}
