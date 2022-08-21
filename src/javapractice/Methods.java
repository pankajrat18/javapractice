package javapractice;

public class Methods {
	// Approach-1

//	public int getMarks(String studentName) {
//		System.out.println("Student Name is: " + studentName);
//
//		if (studentName.equals("Aman")) {
//			return 24;
//		} else if (studentName.equals("Pankaj")) {
//			return 67;
//		} else if (studentName.equals("King")) {
//			return 100;
//		} else {
//			System.out.println("student Name is not valid: " + studentName);
//			return -1;
//		}
//	}

//Approach-02
	public int getStudentMarks(String studentName) {
		System.out.println("Student Name is: " + studentName);
		int mark = -1;

		if (studentName.equals("Aman")) {
			mark = 12;

		} else if (studentName.equals("Pankaj")) {
			mark = 30;

		} else if (studentName.equals("King")) {
			mark = 90;

		} else {
			System.out.println("student Name is not valid: " + studentName);
			return mark;
		}
		return mark;
	}

	public static void main(String[] args) {

		Methods e1 = new Methods();
//		int marks = e1.getMarks("Uma");
//		System.out.println(marks);
//
//		if (marks == -1) {
//			System.out.println("dont print marksheet");
//
//			int s1 = e1.getMarks("Pankaj");
//			System.out.println(s1);

		int r1 = e1.getStudentMarks("Pankaj");
		System.out.println(r1);

	}

}
