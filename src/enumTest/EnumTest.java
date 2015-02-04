package enumTest;

public class EnumTest {

	public static void main(String args[]) {
		Tools theTools[] = Tools.values();
		for (Tools t : theTools) {
			System.out.println(t.ordinal() + " " + t);
		}
	}

}
