package javapractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(67);
		marks.add(98);
		marks.add(88);

		System.out.println(marks.get(0));
		System.out.println(marks.get(2));
		System.out.println(marks);

		// marks.remove(2);
		System.out.println(marks);

		for (int i = 0; i < marks.size(); i++) {
			System.out.println(marks.get(i));
		}

		System.out.println("------------------");
		ArrayList<String> names = new ArrayList<>();
		names.add("Pankaj");
		names.add("Umaaa");

		System.out.println(names.size());
		System.out.println(names);

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals("Umaaa")) {
				System.out.println("HI");
			}
			System.out.println(names.get(i));
		}
		System.out.println("------------------");

		// Object Dynamic Array
		ArrayList<Object> empdetails = new ArrayList<Object>();
		empdetails.add("Customer");
		empdetails.add(28);
		empdetails.add("King");
		empdetails.add(4567.78);
		empdetails.add(true);

		// for each loop or enhanced loop
		for (Object e : empdetails) {
			System.out.println(e);
			if (e.equals("King")) {
				System.out.println("100% off");
				break;
			}
		}
		System.out.println("------------------");

		ArrayList<String> empdetails1 = new ArrayList<>();
		empdetails1.add("kiki");
		empdetails1.add("Jiji");
		empdetails1.add("Jojo");
		// empdetails1.add(5, "Msha"); //Index out of bound exception

		System.out.println(empdetails1);
		empdetails1.add(0, "Msms");
		System.out.println(empdetails1.get(0));
		System.out.println(empdetails1);
		empdetails1.remove(2);
		System.out.println(empdetails1);
		empdetails1.remove("kiki");
		System.out.println(empdetails1);
		System.out.println(empdetails1.size());
		System.out.println("------------------");

		ArrayList<String> userlist = new ArrayList<>();
		userlist.add("Popo");
		userlist.add("koko");
		System.out.println(userlist);
		userlist.addAll(empdetails1);
		System.out.println(userlist);

		for (int i = userlist.size() - 1; i >= 0; i--) {
			System.out.println(userlist.get(i));

		}
		System.out.println("------------------");

		Collections.reverse(userlist);
		System.out.println(userlist);

		Collections.swap(userlist, 1, 2);
		System.out.println(userlist);

		for (String e : userlist) {
			System.out.println(e);
			if (e.equals("Msms")) {
				System.out.println("PASS");
				break;
			}
		}
		System.out.println(userlist.contains("Popo"));
	}
}
