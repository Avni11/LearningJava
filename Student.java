package finalassesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Student {
	private int id;
	private String name;
	private int marks;
	private String Course;
	Map<Integer, ArrayList> map = new HashMap();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	Scanner s = new Scanner(System.in);

	public void add() {// reading elemnts to list and map
		ArrayList al = new ArrayList();
		System.out.println("enter name");
		setName(s.next());
		System.out.println("enter id");
		setId(s.nextInt());
		System.out.println("enter marks");
		setMarks(s.nextInt());
		System.out.println("enter course");
		setCourse(s.next());
		al.add(getName());
		al.add(getCourse());
		al.add(getMarks());
		map.put(getId(), al);

	}

//delete student info
	public void delete(int id) {
		map.remove(id);
	}

//displaying student info
	public void listofstudents() {
		for (Map.Entry<Integer, ArrayList> entry : map.entrySet()) {
			System.out.println("id =" + entry.getKey() + " " + entry.getValue());
		}
	}

	// sorting
	/*
	 * public void Sorting(){ Set<Entry<Integer, ArrayList>> enteryset =
	 * map.entrySet();
	 * System.out.println("1)Sort by id/n 2)Sort by name/n 3)sort by marks");
	 * System.out.println("enter your choice"); int choice=s.nextInt();
	 * switch(choice) { case 1:
	 * enteryset.stream().sorted(Comparator.comparing(Student::
	 * getName)).forEach(System.out::println); } }
	 */
	public void editbyId(int id) {
		for (Map.Entry<Integer, ArrayList> entry : map.entrySet()) {
			if (entry.getKey() == id) {
				System.out.println("1)edit id\n 2)edit name\n 3)edit mark\n 4)edit course ");
				switch (s.nextInt()) {
				case 1:
					System.out.println("enter id");
					System.out.println(entry.getValue().get(1));
				}
			}
		}
	}
}
