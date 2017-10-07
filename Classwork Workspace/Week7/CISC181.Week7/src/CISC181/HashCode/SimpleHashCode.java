package CISC181.HashCode;

/*
 * http://www.javaworld.com/article/2074996/hashcode-and-equals-method-in-java-object---a-pragmatic-concept.html
 */
public class SimpleHashCode {

	public static void main(String[] args) {

		// CompareStrings();
		 CompareStrings2();
		//CompareObjects();
	}

	private static void CompareStrings() {
		String str1 = "Strings are immutable";
		String str2 = new String("Strings are immutable");
		String str3 = new String("Integers are not immutable");
		String str4 = "Strings are immutable";

		int result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		str1 = "bert";
		System.out.println("Change");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

	}

	private static void CompareStrings2() {
		String str1 = new String("ABC");
		String str2 = new String("ABC");

		String s = "string constant";
		int result = str1.compareTo(str2);
		System.out.println(result);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

	}

	private static void CompareObjects() {
		Rectangle rec1 = new Rectangle(10, 20) {
			@Override
			public int hashCode() {
				return 4;
			}
		};
		Rectangle rec2 = new Rectangle(10, 20);

		String strUserName = "bgibbons";
		String strPassword = "MyPassword";

		System.out.println(rec1.hashCode());
		System.out.println(rec2.hashCode());
		System.out.println(strUserName.hashCode());
		System.out.println(strPassword.hashCode());

		if (rec1.equals(rec2)) {
			System.out.println("Rec1 == Rec2");
		} else {
			System.out.println("Rec1 != Rec2");
		}
		rec1 = rec2;
		if (rec1.equals(rec2)) {
			System.out.println("Rec1 == Rec2");
		} else {
			System.out.println("Rec1 != Rec2");
		}
		System.out.println("New hash codes:");
		System.out.println(rec1.hashCode());
		System.out.println(rec2.hashCode());

	}

}
