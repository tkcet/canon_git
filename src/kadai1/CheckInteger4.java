package kadai1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力してください：");
		int num = scan.nextInt();

		if((num % 2) == 0) {
			if(num > 0) {
				System.out.println(num + "は正の偶数です");
			} else if(num < 0) {
				System.out.println(num + "は負の偶数です");
			} else {
				System.out.println(num + "は正でも負でもない偶数です");
			}
		} else {
			if(num > 0) {
				System.out.println(num + "は正の奇数です");
			} else {
				System.out.println(num + "は負の奇数です");
			}
		}

	}

}
