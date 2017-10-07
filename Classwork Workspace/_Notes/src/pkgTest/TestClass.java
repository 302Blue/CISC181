package pkgTest;

import java.util.HashSet;
import java.util.regex.Pattern;

public class TestClass {
	
	protected double Hi = 4;
	public static void main(String[] args){
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		String newPhone_number = "302-832-5527";
		if (Pattern.matches(regex, newPhone_number)){
			System.out.println("YAY");
			TestClass testClass = new TestClass();
			}
		Integer a = new Integer(4);
		Integer b = new Integer(8);
		Integer c = new Integer(4);
		HashSet hs = new HashSet();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		System.out.println(hs);
	}

}
