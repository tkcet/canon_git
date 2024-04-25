package kadai4add;

public class Convert {

	static void reverse(int numInt) {
		String strInt = String.valueOf(numInt);
		String result = new StringBuilder(strInt).reverse().toString();
		System.out.println(result);
	}

	static void reverse(double numDouble) {
		String strDouble = String.valueOf(numDouble);
		String result = new StringBuilder(strDouble).reverse().toString();
		System.out.println(result);
	}

	static void reverse(String string) {
		String str = String.valueOf(string);
		String result = new StringBuilder(str).reverse().toString();
		System.out.println(result);
	}
}
