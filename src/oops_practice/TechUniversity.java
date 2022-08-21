package oops_practice;

public class TechUniversity extends University {

	public void technicalInspection() {

		System.out.println("TechUniversity--TechnicalInspection");
	}

	@Override
	public void admin() {

		System.out.println("TechUniversity--Admin");
	}

	public void questionPaperSet() {
		System.out.println("TechUniversity--questionPaperSet");

	}

	public void studentPassingCertificate() {
		System.out.println("TechUniversity-studentPassingCertificate");
	}

}

//Override - Below conditions needs to be fulfilled: (It should be in different class. Used in Inheritance OOPS concept)
// Method name should be same
// Parameter should be same
//Data type/return type should be same
// Sequence of Type should be same

//Overloading
// It should be in same class
// Method name should be same
//