package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		int[] numbers = { 1, 7, 2, 7, 3 };

		for (int data : numbers) {
			if (data == 7) {
				count++;
			}
		}
		System.out.println(count + "個ありました");

	}

}
