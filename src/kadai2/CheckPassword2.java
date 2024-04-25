package kadai2;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String pw;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("パスワードを入力して下さい：");
		pw = scan.next();
		while (!pw.equals("himitu")) {
			System.out.print("再入力して下さい：");
			pw = scan.next();
		}
		System.out.println("ログインできました");
	}

}
