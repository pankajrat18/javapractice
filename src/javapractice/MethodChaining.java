package javapractice;

public class MethodChaining {
	String name;
	int age;

	public int add(int a, int b) {
		int z = a + b;
		return z;

	}

	public void getinfo(MethodChaining t1) {
		System.out.println(t1.name + " " + t1.age);

		t1.name = "Pankaj";
		t1.age = 45;
		System.out.println(t1.name + " " + t1.age);

	}

	public static void main(String[] args) {

		MethodChaining obj = new MethodChaining();

		System.out.println(obj.add(10, 20)); // call by values

		obj.name = "Una";
		obj.age = 34;
		obj.getinfo(obj); // call by reference

		// System.out.println(obj.name + " " + obj.age);

	}

}
