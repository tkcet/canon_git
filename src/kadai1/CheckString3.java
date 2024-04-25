package kadai1;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		System.out.print("名前：");
		String str = scan.next();
		
		num = str.length();
		
		if(num <= 20) {
			System.out.println("ようこそ" + str + "さん");
		} else {
			System.out.println("20文字以内で入力してください");
		}
	}

}
