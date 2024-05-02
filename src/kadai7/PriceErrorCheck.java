package kadai7;

import java.util.Scanner;

public class PriceErrorCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price = 0; // 価格初期値:0 
		System.out.print("価格：");
		// 整数チェック（エラーの場合は終了）
		try {
			price = scan.nextInt();
		} catch (Exception e) {
			System.out.println("整数で入力してください");
			return;
		}
		// 範囲チェック（エラーの場合は終了） 
		if (price < 0) {
			System.out.println("マイナスの値です");
			return;
		}
		System.out.println(price + "円を登録しました");
		scan.close();

	}

}
