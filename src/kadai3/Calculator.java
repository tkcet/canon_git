package kadai3;

public class Calculator {

	public static void main(String[] args) {
		int a = add(3, 7);

		System.out.println(a);

		int b = sub(3, 7);

		System.out.println(b);

		double c = avg(3, 7);

		System.out.println(c);
	}

	// 加算
	static int add(int num1, int num2) {
		int result = num1 + num2;

		return (result);
	}

	// 減算
	static int sub(int num1, int num2) {
		int result = num1 - num2;

		return (result);
	}

	// 平均
	static double avg(int num1, int num2) {
		double result = (double) (num1 + num2) / 2;

		return (result);
	}

}
