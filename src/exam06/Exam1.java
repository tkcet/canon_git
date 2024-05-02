package exam06;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;

		System.out.print("名前：");
		name = scan.next();
		System.out.print("年齢：");
		age = scan.nextInt();

		System.out.println(name + "さんの10年後は" + (age + 10) + "歳です！");
	}

}
