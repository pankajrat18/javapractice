package javapractice;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
//Static Arrays
		int i[] = new int[5];
		int li = 0;
		int hi = 4;
		int len = i.length;
		System.out.println("size of array = " + len);
		System.out.println("highest index= " + (len - 1));

		i[0] = 13;
		i[1] = 20;
		i[2] = 30;
		i[4] = 50;

//		System.out.println(i[3]);
//		for (int j = 0; j <= i.length - 1; j++) {
//			System.out.println(i[j]);

		System.out.println(Arrays.toString(i));

		double d[] = new double[2];
		d[0] = 12;
		d[1] = 15.56;
		System.out.println(Arrays.toString(d));

		String str[] = new String[3];
		str[0] = "Pankaj";
		str[1] = "Kuku";
		str[2] = "King";

		for (int l = 0; l <= str.length - 1; l++) {
			if (str[l].equals("King")) {
				System.out.println("Cool");
			}
			System.out.println(str[l]);
		}

		System.out.println(Arrays.toString(str));
//Object Array
		Object z[] = new Object[5];
		z[0] = "Loo";
		z[1] = 34.56;
		z[2] = 'f';
		z[3] = false;
		z[4] = 5;

		// System.out.println(Arrays.toString(z));

		for (int p = 0; p <= z.length - 1; p++) {
			System.out.println(z[p]);

		}

		// Dynamic Arrays

	}

}
