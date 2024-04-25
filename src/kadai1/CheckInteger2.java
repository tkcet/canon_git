package kadai1;

import java.util.Scanner;

public class CheckInteger2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("xの値を入力してください：");
		int numx = scan.nextInt();
		System.out.print("yの値を入力してください：");
		int numy = scan.nextInt();

		if(numx < numy) {
			System.out.println("xはyより小さいです");
		} else if(numx > numy) {
			System.out.println("xはyより大きいです");
		} else {
			System.out.println("xとyは等しいです");
		}

	}

}