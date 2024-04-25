package kadai2add;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i0, i1, num;
		Scanner scan = new Scanner(System.in);

		System.out.print("繰り返す回数を入力してください：");
		num = scan.nextInt();

		String[] str = new String[num];
		String sentence = "";

		for (i0 = 0; i0 < num; i0++) {
			System.out.print((i0 + 1) + "つ目の文字列を入力してください：");
			str[i0] = scan.next();
			sentence += str[i0];
			System.out.println(sentence);
		}
	}

}
