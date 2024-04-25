package kadai1add;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int japanese = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int math = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int english = scan.nextInt();
		
		int max = japanese;
		
		if(max < math) {
			max = math;
			if(max < english) {
				max = english;
				System.out.print("最高点は英語で" + max + "点です");
			} else if(max > english){
				System.out.print("最高点は数学で" + max + "点です");
			} else {
				System.out.print("最高点は数学と英語で" + max + "点です");
			}
		} else if(max > math){
			if(max < english) {
				max = english;
				System.out.print("最高点は英語で" + max + "点です");
			} else if(max > english) {
				System.out.print("最高点は国語で" + max + "点です");
			} else {
				System.out.print("最高点は国語と英語で" + max + "点です");
			}
		} else {
			if(max < english) {
				max = english;
				System.out.print("最高点は英語で" + max + "点です");
			} else if(max > english) {
				System.out.print("最高点は国語と数学で" + max + "点です");
			} else {
				System.out.print("最高点は国語と数学と英語で" + max + "点です");
			}
		}

	}

}
