package com.lrn.assesment;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class StudentManupulation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student student=new Student();
		try {
			int choice = 0;
			System.out.println("1.Add Student\n2.Edit Student\n3.Delete Student\n4.List of Students"
					+ "\n5.Get Student Details\n6.Sort the Students\n7.Exit\n");
	
			System.out.println("enter your choice");
			choice = s.nextInt();
			while (choice != 7){
				switch (choice) {
				case 1:
					Student student1 = new Student();
					System.out.println("enter id");
					student1.setId(s.nextInt());
					System.out.println("enter name");
					student1.setName(s.next());
					System.out.println("enter marks");
					student1.setMarks(s.nextInt());
					System.out.println("enter course");
					student1.setCourse(s.next());
					student.set.add(student1);
					break;
				case 2:
					new Editstudentinfo().editStudent(student.set, s);
					break;
				case 3:
					System.out.println("enter the id to be deleted ");
				student.delete(s.nextInt());
					break;
				case 4:
					student.display();
					break;
				case 5:
					System.out.println("ënter id");
					student.getinfoId(s.nextInt());
					break;
				case 6:
					new Sorting().sorting(student.set, s);
					break;
				case 7:
					break;
				default:
					System.out.println("Enter Valid Option");
					break;
				}
				System.out.print("Enter the Option :");
				choice = s.nextInt();
			} 
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		s.close();
		System.out.println("Program Ended...");
	}
}
