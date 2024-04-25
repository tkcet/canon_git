package kadai2;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
		int num = 3; // 趣味の登録数
		String[] hobbyList = new String[num];
		Scanner scan = new Scanner(System.in);

		System.out.println("情報を登録します");

		System.out.print("名前：");
		String name = scan.next();

		for (i = 0; i < hobbyList.length; i++) {
			System.out.print("趣味" + (i + 1) + "：");
			hobbyList[i] = scan.next();
		}

		System.out.println("---");
		System.out.println("こんにちは" + name + "です");
		System.out.println("私の趣味は、");

		for (String data : hobbyList) {
			System.out.println("・" + data);
		}

		System.out.println("です");

	}

}
