package finalassesment;

import java.util.Scanner;

public class Manupulation {
	public static void main(String[] args) {
		Student student = new Student();
		Scanner s = new Scanner(System.in);
		System.out.println("1)add Student \n 2)Edit Student info\n"
				+ "3)Delete Student\n 4)List of Student \n 5)Get student info \n " + "6)sort student List\n 7)Exit");
		System.out.println("Enter your choice");
		int n = s.nextInt();
// if(n<0 && n>7) {
		// System.out.println("enter Valid Choice");
// }
		while (n != 7) {
			switch (n) {
			case 1:
				student.add();
				break;
			case 3:
				System.out.println("enter id to be deleted");
				student.delete(s.nextInt());
				break;
			case 4:
				student.listofstudents();
				break;
			case 5:
				System.out.println("enter the id you want to edit");
				int i=s.nextInt();
				student.editbyId(i);
				break;
			}
			System.out.println("1)add Student \n 2)Edit Student info\n"
					+ "3)Delete Student\n 4)List of Student \n 5)Get student info \n " + "6)sort student List\n 7)Exit");
			System.out.println("Enter your choice");
			 n = s.nextInt();
		}
		System.out.println("Program Ended");

	}
}
