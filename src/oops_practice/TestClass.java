package oops_practice;

public class TestClass {

	public static void main(String[] args) {
		TechUniversity a = new TechUniversity();
		a.admin(); // override
		a.questionPaperSet(); // individual
		a.resultpublication(); // inherited

		System.out.println("--------------");

		IIMA b = new IIMA();
		b.rank1college(); // individual
		b.questionPaperSet(); // override
		b.technicalInspection(); // inherited

		System.out.println("--------------");

		IIMB c = new IIMB();
		c.technicalInspection(); // override
		c.rank2College(); // individual
		c.resultpublication(); // inherited
		c.studentPassingCertificate(); // inherited

		System.out.println("--------------");

		IIMC d = new IIMC();
		d.admin(); // inherited
		d.studentPassingCertificate(); // override
		d.resultpublication(); // inherited
		d.rank3College(); // individual
		d.admin();

		System.out.println("--------------");
		// Top Casting - child class object referred by parent class reference obj

		TechUniversity e = new IIMA(); // except individual methods in child class all are accessible
		e.questionPaperSet();
		e.admin();
		e.technicalInspection();
		e.studentPassingCertificate();

		System.out.println("--------------");

		BMW c1 = new BMW();

	}

}
