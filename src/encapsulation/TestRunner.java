package encapsulation;

public class TestRunner {

	public static void main(String[] args) {
		LoginPage obj = new LoginPage();

		obj.setPassword("1224");
		// obj.getUsername();

		System.out.println(obj.getPassword());

	}

}
