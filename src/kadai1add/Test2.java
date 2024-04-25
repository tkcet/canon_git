package kadai1add;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int japanese = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int math = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int english = scan.nextInt();
		
		if((japanese >= 80) && (math >= 75) && (english >= 70)) {
			System.out.print("合格です");
		} else {
			System.out.print("不合格です");
		}

	}

}
