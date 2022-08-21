package javapractice;

public class SwitchCase {

	public static void main(String[] args) {

		int marks = 70;

		switch (marks)

		{

		case 40:
			System.out.println("Average");
			break;

		case 70:
			System.out.println("Excellent");
			break;

		default:
			System.out.println("Entered marks are incorrent");
			break;

		}

	}
}