package com.lrn.assesment;

import java.util.Scanner;
import java.util.Set;

public class Editstudentinfo {
	void editStudent(Set<Student> set, Scanner scanner) {
		System.out.print("Enter Student Id to be edited :");
		int EditId = scanner.nextInt();
		int choice;
		int f=0;
		for (Student student : set) {
			if(student.getId()==EditId) {
				System.out.println("enter your edit choice by 1)id\n 2)name"
						+ "\n3)mark\n4)Course");
				choice=scanner.nextInt();
				f=1;
				switch(choice) {
				case 1:
					System.out.println("ënter new id");
					student.setId(scanner.nextInt());
					break;
				case 2:
					System.out.println("enter name");
					student.setName(scanner.next());
					break;
				case 3:
					System.out.println("enter mark");
					student.setMarks(scanner.nextInt());
					break;
				case 4:
					System.out.println("enter course");
					student.setCourse(scanner.next());
					break;
				default:
					System.out.println("enter valid choice");
				}
			}
		}
		if(f==0) {
			System.out.println("id doesnt exist");
		}
	}

}
