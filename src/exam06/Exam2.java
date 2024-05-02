package exam06;

public class Exam2 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 4, 3, 2 };

		for (int data : array) {
			if ((data % 2) != 0) {
				System.out.println(data);
			}
		}
	}

}
