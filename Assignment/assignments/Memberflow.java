package com.lrn.java.Assignment.assignments;

public class Memberflow {
public static void main(String[] args) {
	Employee e=new Employee("develper","abi","1/23 cbe-TN",99506879,23,509978);
	Manager m=new Manager("Manager","rinson","23-yiuhhv-i",786579,29,6785674);
	System.out.println("employee details");
	System.out.println("Name "+e.name+"\t"+"Dept "+e.dept+"\t"+"phone "+e.phone_num);
	e.printsalary();
	e.specialization();
	System.out.println("Name "+m.name+"\t"+"Dept "+m.dept+"\t"+"phone "+m.phone_num);
	m.printsalary();
	m.specialization();
}
}
