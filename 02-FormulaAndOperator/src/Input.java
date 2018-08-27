
public class Input {

	public static void main(String[] args) {
		System.out.println("あなたの名前を入力して下さい");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの星座を入力して下さい");
		String holoscope = new java.util.Scanner(System.in).nextLine();
		System.out.println("こんにちは、" + holoscope + "座の" + name + "さん");

	}

}

