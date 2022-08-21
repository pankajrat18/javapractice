package javapractice;

public class Browser {

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name is: " + browserName);
		boolean flag = false;

		switch (browserName) {
		case "chrome":
			System.out.println("chrome browser is launched");
			flag = true;
			break;

		case "edge":
			System.out.println("edge browser is launched");
			flag = true;
			break;

		case "IE":
			System.out.println("IE browser is launched");
			flag = true;
			break;

		case "ff":
			System.out.println("ff browser is launched");
			flag = true;
			break;

		default:
			System.out.println("pls pass correct browser name");
			break;

		}
		return flag;
	}

	public static void main(String[] args) {

		Browser e1 = new Browser();
		boolean a = e1.launchBrowser("chrome");
		System.out.println(a);

		if (a) {
			System.out.println("https//:google.com");
		}

		boolean b = e1.launchBrowser("yahoo");
		System.out.println(b);

		if (b) {
			System.out.println("https://yahoo.com");
		}
	}

}
