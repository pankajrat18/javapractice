package encapsulation;

public class UserRunner {

	public static void main(String[] args) {
		User obj = new User("Panlaj", 30, false);

		System.out.println(obj.getUsername());
		System.out.println(obj.getAge());
		System.out.println(obj.isActive());

		obj.setIsActive(true);
		System.out.println(obj.isActive());

		System.out.println("------------");

		obj.setUsername("Umakant");
		System.out.println(obj.getUsername());
		System.out.println(obj.getAge());

		System.out.println(obj.isActive());
	}

}
