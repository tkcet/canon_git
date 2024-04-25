package kadai2;

import java.util.Scanner;

public class CheckPassword1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i0;
		String pw;
		Scanner scan = new Scanner(System.in);

		for (i0 = 0; i0 < 3; i0++) {
			System.out.print("パスワードを入力して下さい：");
			pw = scan.next();
			if (pw.equals("himitu")) {
				System.out.println("ログインできました");
				break;
			} else {
				System.out.println("不正解です");
			}
		}
	}

}
