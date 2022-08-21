package stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "My name is Pankaj and I am from Aurangabad";

		int length = str.length();
		System.out.println(length);
		int hi = length - 1;
		int li = 0;

		System.out.println("----------");

		System.out.println(str.charAt(3));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', str.indexOf('a') + 1));
		System.out.println(str.indexOf('a', str.indexOf(('a') + 1) + 1));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		String msg = "Wlcm Pankaj";
		if (msg.indexOf("Pankaj") != -1) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String p1 = "Mama is chingus in nature";
		System.out.println(p1.replace(" in ", " baba "));

		String k1 = "01/04/1990";
		System.out.println(k1.replace("/", "-"));

		String k2 = " I have joined naveenautomation lab class for selenium";
		System.out.println(k2.contains("class"));
		if (k2.contains("nium")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}

	}

}
