package javapractice;

public class Loops {

	public static void main(String[] args) {
// Max number using && operator

		int x = 1600;
		int y = 2200;
		int z = 390;
		int a = 500;

		if (x > y && x > z && x > a) {
			System.out.println("x is greated number");
		}

		else if (y > z && y > a) {
			System.out.println("y is greated number");
		} else if (z > a) {
			System.out.println("z is greated number");

		} else {
			System.out.println("a is greated number");
		}

//while loop
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		// for loop
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + ":" + (int) c);

		}

		// do while loop
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 0);

	}
}
