package javapractice;

public class Employee {
	String name;
	int age;
	double salary;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Pankaj";
		e1.age = 23;
		e1.salary = 56.67;

		// System.out.println(e1.name + " " + e1.age + " " + e1.salary);

		Employee e2 = new Employee();
		e2.name = "King";
		e2.age = 34;
		e2.salary = 45.44;

		Employee e3 = new Employee();
		e3.name = "Queen";
		e3.age = 32;
		e3.salary = 41.44;

		Employee e4 = new Employee();
		e4.name = "Huma";
		e4.age = 12;
		e4.salary = 49.44;

		e1 = e2;
		System.out.println(e1.name + " " + e1.age + " " + e1.salary);
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);
		System.out.println(e3.name + " " + e3.age + " " + e3.salary);
		System.out.println(e4.name + " " + e4.age + " " + e4.salary);

		System.out.println("--------------------------");

		e2 = e4;
		System.out.println(e1.name + " " + e1.age + " " + e1.salary);
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);
		System.out.println(e3.name + " " + e3.age + " " + e3.salary);
		System.out.println(e4.name + " " + e4.age + " " + e4.salary);

		System.out.println("--------------------------");

		e4 = e1;
		System.out.println(e1.name + " " + e1.age + " " + e1.salary);// K
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);// H
		System.out.println(e3.name + " " + e3.age + " " + e3.salary);// Q
		System.out.println(e4.name + " " + e4.age + " " + e4.salary);// k

		System.out.println("--------------------------");
		e3 = e2;

		System.out.println(e1.name + " " + e1.age + " " + e1.salary);// K
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);// H
		System.out.println(e3.name + " " + e3.age + " " + e3.salary);// H
		System.out.println(e4.name + " " + e4.age + " " + e4.salary);// K

	}

}
