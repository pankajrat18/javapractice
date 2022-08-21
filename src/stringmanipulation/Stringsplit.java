package stringmanipulation;

import java.util.Arrays;

public class Stringsplit {

	public static void main(String[] args) {
		String sp = "Pankaj:Uma:Rama:Kanha:1234:TCS";

		String p[] = sp.split(":");
		System.out.println(p[0]);
		System.out.println(p[2]);

		System.out.println(Arrays.toString(p));

		for (String e : p) {
			System.out.println(e);
		}

		String s = new String("Selenium");
		s += " Java";

		System.out.println(s);

	}

}
