package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int numPC = r.nextInt(100);
		int count = 1;

		while (true) {
			System.out.print("数字を入力してください：");
			int num = scan.nextInt();

			if (num < numPC) {
				count++;
				System.out.println("**小さすぎです**");
			} else if (num > numPC) {
				count++;
				System.out.println("**大きすぎです**");
			} else {
				System.out.println("**当たりです**");
				System.out.println(count + "回で当たりました！");
				return;
			}
		}

	}

}
