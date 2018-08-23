
public class fax {

	public static void main(String[] args) {
		final double tax = 1.08;
		int fax = 20000;
		System.out.println("FAX値下げしました");
		fax = 18000;
		System.out.println("FAXの新価格（税込み）");
		System.out.println(fax * tax + "円");

	}

}
