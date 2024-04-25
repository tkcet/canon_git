package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int numPC;
		String strnum;

		while (true) {
			numPC = r.nextInt(987) + 1;
			strnum = String.valueOf(numPC);
			if (strnum.charAt(0) == strnum.charAt(1)) {

			} else if (strnum.charAt(0) == strnum.charAt(2)) {

			} else if (strnum.charAt(1) == strnum.charAt(2)) {

			} else {
				break;
			}

		}
		int count = 1;
		int hit = 0;
		int blow = 0;

		while (true) {
			System.out.print("3桁の数字を入力してください：");
			String num = scan.next();

			if (num.equals(strnum)) {
				System.out.println("3ヒット・0ブロー");
				System.out.println(count + "回で当たりました！");
				return;
			} else {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (strnum.charAt(i) == num.charAt(j)) {
							if (i == j) {
								hit++;
							} else {
								blow++;
							}
						}
					}
				}
				System.out.println(hit + "ヒット・" + blow + "ブロー");
			}
			count++;
			hit = 0;
			blow = 0;
		}

	}

}
