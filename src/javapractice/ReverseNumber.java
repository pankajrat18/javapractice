package javapractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// Reverse a number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();
//
//		// 01. Using Algoritghhm
//
//		int rev = 0;
//
//		while (num != 0) {
//
//			rev = rev * 10 + num % 10;
//			num = num / 10;

//		}
		// System.out.println("Reverse number is: " + rev);

		// Using String Buffer

//		StringBuffer str = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = str.reverse();
//		System.out.println("Reverse number is: " + rev);

		// String Builder
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("Reverse number is: " + rev);
	}

}
