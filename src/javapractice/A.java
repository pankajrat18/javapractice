package javapractice;

public class A {

	String name;
	int number;
	static String college;

	public void main(int a) {
		System.out.println("OVerloading");
	}

	public void main(String a, int b) {
		System.out.println("Main method overloading");

	}

	public static void getnumber() {

		System.out.println("Get Number");
	}

	public static void main(String[] a) {
		System.out.println("A Main");
		A obj = new A();
		obj.main(10);
		obj.main("Pankaj", 55);

		A.college = "JBVM";
		obj.name = "Pankaj";
		obj.number = 20;
		A.getnumber();

		// System.out.println(a.length);
		// System.out.println(a[0]);

		// B.main(args);

	}

}
