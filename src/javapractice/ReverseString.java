package javapractice;

public class ReverseString {

	public static void main(String[] args) {

		// Approach 1

		String str = "ABDEF";
		String rev = "";

		// int a = str.length();
//		// System.out.println(a);
//
//		for (int i = a - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//
//		}
//		System.out.println(rev);

		// Approach-02 (using Char array)
//		char a[] = str.toCharArray();
//		int len = str.length();
//
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + a[i];
//		}
//		System.out.println(rev);

		// Approach-03
		StringBuffer st = new StringBuffer(str);
		System.out.println(st.reverse());
	}

}
