package kadai2add;

import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i0, num;
		int max = 0;
		String sentence = "";
		Scanner scan = new Scanner(System.in);

		System.out.print("文字列の個数を入力してください：");
		num = scan.nextInt();

		String[] str = new String[num];

		for (i0 = 0; i0 < num; i0++) {
			System.out.print((i0 + 1) + "つ目の文字列を入力してください：");
			str[i0] = scan.next();
		}
		for (i0 = 0; i0 < num; i0++) {
			if (max < str[i0].length()) {
				max = str[i0].length();
				sentence = str[i0];
			}
		}
		System.out.println("最も長い文字列は「" + sentence + "」です");
	}

}
