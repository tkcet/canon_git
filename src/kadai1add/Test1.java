package kadai1add;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int japanese = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int math = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int english = scan.nextInt();
		
		double ave;
		
		ave = (japanese + math + english) / 3.;
		System.out.print("平均は" + ave + "点です");

	}

}
