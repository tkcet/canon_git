package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartSystem {
	// 商品情報保存リスト（フィールド） 
	private static List<Item> cart = new ArrayList<Item>();
	// スキャナークラス（フィールド） 
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int select;

		do {
			String name = "";
			String author = "";
			int price = 0;
			int count = 1;
			int goodsNo;
			String str;

			System.out.print("1.商品追加\n2.書籍追加\n3.情報更新\n4.カートから削除\n"
					+ "5.カートを検索\n6.購入\n9.終了\n");
			System.out.print("メニューを選択してください：");
			select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.println("商品をカートに追加します");
				System.out.print("商品名を入力してください：");
				name = scan.next();
				System.out.print("価格を入力してください：");
				price = scan.nextInt();
				cart.add(new Item(name, price));
				break;
			case 2:
				System.out.println("書籍をカートに追加します");
				System.out.print("商品名を入力してください：");
				name = scan.next();
				System.out.print("著者を入力してください：");
				author = scan.next();
				System.out.print("価格を入力してください：");
				price = scan.nextInt();
				cart.add(new Book(name, price, author));
				break;
			case 3:
				System.out.println("情報を更新します");
				System.out.print("　No.を入力してください：");
				goodsNo = scan.nextInt();
				if ((0 <= goodsNo - 1) && (goodsNo - 1 < cart.size())) {
					if (cart.get(goodsNo - 1) instanceof Book) {
						System.out.print("　書籍名を入力してください（現在："
								+ cart.get(goodsNo - 1).getName() + "）：");
						name = scan.next();
						System.out.print("　著者を入力してください（現在："
								+ ((Book) cart.get(goodsNo - 1)).getAuthor() + "）：");
						author = scan.next();
						System.out.print("　価格を入力してください（現在："
								+ cart.get(goodsNo - 1).getPrice() + "）：");
						price = scan.nextInt();
						cart.get(goodsNo - 1).setName(name);
						((Book) cart.get(goodsNo - 1)).setAuthor(author);
						cart.get(goodsNo - 1).setPrice(price);
					} else if (cart.get(goodsNo) instanceof Item) {
						System.out.print("　商品名を入力してください（現在："
								+ cart.get(goodsNo - 1).getName() + "）：");
						name = scan.next();
						System.out.print("　価格を入力してください（現在："
								+ cart.get(goodsNo - 1).getPrice() + "）：");
						price = scan.nextInt();
						cart.get(goodsNo - 1).setName(name);
						cart.get(goodsNo - 1).setPrice(price);
					}
				} else {
					System.out.println("　選択されたNo.はありません ");
				}
				break;
			case 4:
				System.out.println("カートから削除します");
				System.out.print("　No.を入力してください：");
				goodsNo = scan.nextInt();
				if ((0 < goodsNo) && (goodsNo < cart.size())) {
					cart.remove(goodsNo);
				} else {
					System.out.println("　選択されたNo.はありません ");
				}
				break;
			case 5:
				System.out.println("カートを検索します");
				System.out.print("　検索キーワードを入力してください：");
				str = scan.next();
				String goods;
				for (Item data : cart) {
					goods = data.getName();
					if (goods.indexOf(str) != -1) {
						System.out.println("商品情報");
						System.out.println("----------------------");
						System.out.println(data.getInfo());
						System.out.println("----------------------");
						break;
					}
				}
				break;
			case 6:
				System.out.println("購入します");
				int sum = 0;
				int size = cart.size();
				for (Item data : cart) {
					sum += data.getPrice();
				}
				System.out.println("　***合計金額は" + sum + "円です***");
				for (int i = 0; i < size; i++) {
					cart.remove(0);
				}
				break;
			default:
				break;
			}

			if ((select != 5) && (select != 9)) {
				System.out.println("No.　　商品情報");
				System.out.println("----------------------");
				for (Item data : cart) {
					System.out.println(count + "　　　" + data.getInfo());
					count++;
				}
				System.out.println("----------------------");
			}
		} while (select != 9);
	}
}
