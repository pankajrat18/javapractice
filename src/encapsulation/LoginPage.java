package encapsulation;

public class LoginPage {
	private String username;
	private String password;

	public String getUsername() {
		if (username == null) {
			System.out.println("Enter a valid username");
		}
		return username;
	}

	public void setUsername(String username) {
		if (username == null) {
			return;
		}
		if (username.isBlank()) {
			return;
		}
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
