package exam06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("年齢を入力してください：");
		int a = 0;

		try {
			a = scan.nextInt();
			if ((a < 0) || (130 < a)) {
				System.out.println("0以上130以下で入力してください");
			} else {
				System.out.println(a + "歳で登録しました");
			}
		} catch (InputMismatchException e) {
			System.out.println("整数で入力してください");
		}
		scan.close();
	}

}
