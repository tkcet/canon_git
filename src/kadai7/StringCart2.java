package kadai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCart2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("商品を追加してください：");
			String goods = scan.next();
			list.add(goods);
		}

		for (String data : list) {
			System.out.println(data);
		}
	}

}
