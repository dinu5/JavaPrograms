package com.dinu;

import java.util.*;

public class SortingStudentobj {

	public static void main(String[] args) {
//		Student arr[]=new Student[3];
//		arr[0]=new Student("Dino",25);
//		arr[1]=new Student("Ishita",18);
//		arr[2]=new Student("Dimple",2);
//		Arrays.sort(arr);
//		for(Student e: arr) {
//			System.out.println(e.getName()+" : "+e.getAge());
//		}
		
		Employee[] empArr=new Employee[3];
		empArr[0]=new Employee("Dino", 25,40000);
		empArr[1]=new Employee("Payel",27, 50000);
		empArr[2]=new Employee("Ishita",18, 2000);
		Arrays.sort(empArr, new EmpSortByAge());
		for(Employee ans : empArr) {
			System.out.println(ans.getName()+" "+ans.getSalary()+" "+ans.getAge());
		}

	}

}

class Student implements Comparable<Student>{
	
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int compareTo(Student s) {
		return this.age - s.age;
	}
	
}



class Employee{
	String name;
	int age;
	int salary;
	
	public Employee(String name,int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getName() {
		return this.name;
		
	}
	public int getAge() {
		return this.age;
	}
	public int getSalary() {
		return this.salary;
	}
	
}

class EmpSortByAge implements Comparator<Employee>{

	public int compare(Employee emp1, Employee emp2) {
		return emp1.getAge() - emp2.getAge();
	}
}














