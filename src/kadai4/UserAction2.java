package kadai4;

import java.util.Scanner;

public class UserAction2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = new User();

		System.out.println("会員を登録します");
		System.out.print("名前：");
		user.name = scan.next();
		System.out.print("年齢：");
		user.age = scan.nextInt();

		System.out.println("---");

		System.out.println("会員を登録しました");
		user.showInfo();
	}

}
