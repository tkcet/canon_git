package exam06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		Map<String, String> map = new HashMap<String, String>();

		do {
			System.out.println("1：登録　2：削除　3：一覧表示　9：終了");
			System.out.print("操作番号を入力してください：");
			select = scan.nextInt();
			String name;
			String tell;

			switch (select) {
			case 1:
				System.out.print("名前を入力してください：");
				name = scan.next();
				System.out.print("電話番号を入力してください：");
				tell = scan.next();
				map.put(name, tell);
				break;
			case 2:
				System.out.print("名前を入力してください");
				name = scan.next();

				break;
			case 3:
				Set<String> list = map.keySet();
				for (String key : list) {
					System.out.println(key + "　" + map.get(key));
				}
				break;
			default:
				break;
			}
		} while (select != 9);
		scan.close();
	}
}
