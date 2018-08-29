
public class Practice3 {

	public static void main(String[] args) {

		System.out.println("ノート占い");

		// 名前の入力を求める
		System.out.println("名前を入力して下さい");
		// 名前の入力を受け付ける
		String name = new java.util.Scanner(System.in).nextLine();

		// 年齢の入力を求める
		System.out.println("年齢を入力して下さい");
		// 年齢の入力を受け付ける
		String ageString = new java.util.Scanner(System.in).nextLine();
		// 変数ageStringをint型に変換
		int age = Integer.parseInt(ageString);
		// 乱数を生成
		int fortune = new java.util.Random().nextInt(4);
		// 1増やす
		fortune = fortune ++;

		// メッセージを表示
		System.out.println("占いの結果");
		System.out.println(ageString + "歳の" + name + "さんのラッキーアイテムは" + fortune + "です");

		System.out.println("1:モレスキン");
		System.out.println("2:ツバメノート");
		System.out.println("3:キャンパスノート");
		System.out.println("4:紳士のノート");





	}

}
