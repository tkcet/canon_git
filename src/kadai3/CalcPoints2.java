package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();

		// 会員ランクによる判定
		getPoints(price, rank);

		scan.close();

	}

	// ポイント計算
	static void getPoints(int Price, int judge) {
		int point;

		if (judge == 1) {
			point = (int) (Price * 0.2);
			System.out.println("プレミア会員には" + point + "ポイント付与されます");
		} else {
			point = (int) (Price * 0.1);
			System.out.println("無料会員には" + point + "ポイント付与されます");
		}
	}

}
