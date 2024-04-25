package kadai2add;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1, str2;
		Scanner scan = new Scanner(System.in);

		System.out.print("1つ目の文字列を入力してください：");
		str1 = scan.next();
		System.out.print("2つ目の文字列を入力してください：");
		str2 = scan.next();
		
		if(str1.equals(str2)) {
			System.out.print("2つの文字列は同じです");
		} else {
			System.out.print("2つの文字列は異なります");
		}
	}

}
