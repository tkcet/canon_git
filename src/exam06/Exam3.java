package exam06;

public class Exam3 {

	public static void main(String[] args) {
		int a1 = getSquareArea(3, 3);
		System.out.println(a1);
		
		double a2 = getTriangleArea(3, 3);
		System.out.println(a2);
	}

	static int getSquareArea(int a, int b) {
		int s;

		s = a * b;

		return (s);
	}

	static double getTriangleArea(int a, int b) {
		double s;

		s = (double) a * b / 2;

		return (s);
	}

}
