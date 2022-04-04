package com.lrn.assesment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private int marks;
	private String Course;
	Scanner s=new Scanner(System.in);
	Set<Student> set = new HashSet<Student>();
	ArrayList al=new ArrayList();
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
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", Course=" + Course + "]";
	}
	void display() {
		System.out.println(set);
	}
	void delete(int dltid) {
		int f=0;
		for (Student object : set) {
			if(object.getId()==dltid) {
				f=1;
				set.remove(object);
			}
		}
		if(f==0) {
			System.out.println("id doesnt exist");
		}
	}
	void getinfoId(int gid) {
		int f=0;
		for (Student obj : set) {
			if(obj.id==gid) {
				f=1;
				System.out.println(obj);
			}
		}
		if(f==0) {
			System.out.println("Id doesnt exist");
		}
	}
}
