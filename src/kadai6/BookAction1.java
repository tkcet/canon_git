package kadai6;

public class BookAction1 {

	public static void main(String[] args) {
		Book b1 = new Book("走れメロス", 450, "太宰治");

		b1.showInfo();

		System.out.println("---");

		Item i1 = new Book("シャーロック・ホームズ", 450, "コナン・ドイル");

		i1.showInfo();
	}

}
