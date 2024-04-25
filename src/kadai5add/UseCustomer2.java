package kadai5add;

import java.util.Scanner;

public class UseCustomer2 {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[3];
		Scanner scan = new Scanner(System.in);

		// 顧客データの読み込み 
		for (int index = 0; index < customerList.length; index++) {
			System.out.println((index + 1)
					+ "人目の顧客情報を入力してください。");
			System.out.print("ID：");
			int id = scan.nextInt(); // IDの入力
			System.out.print("名前：");
			String name = scan.next(); // 名前の入力

			Customer customer;
			if (id == -1) {
				// IDが-1なら名前だけ登録
				customer = new Customer(name);
			} else {
				// IDが-1でなければIDと名前を登録
				customer = new Customer(id, name);
			}
			customerList[index] = customer;
		}

		int select = 0;
		int beforeId = 0;
		do {
			System.out.print("操作（1:一覧表示 2:変更 9:終了）を選択してください：");
			select = scan.nextInt();
			if (select == 1) {
				// 顧客データ表示
				System.out.println();
				System.out.println("=== 顧客データ一覧 ===");
				for (Customer customer : customerList) {
					customer.showData();
				}
			} else if (select == 2) {
				System.out.print("更新するID：");
				beforeId = scan.nextInt();
				int noId = 0;
				for (int i = 0; i < customerList.length; i++) {
					if (beforeId == customerList[i].getId()) {
						System.out.print("新しいID：");
						int afterId = scan.nextInt();
						customerList[i].setId(afterId);
						System.out.print("新しい名前：");
						String afterName = scan.next();
						customerList[i].setName(afterName);
					} else {
						noId++;
					}
				}
				if (noId == 3) {
					System.out.println("指定したIDは存在しません。");
				}
			}

		} while (select != 9);

		scan.close();

	}

}
