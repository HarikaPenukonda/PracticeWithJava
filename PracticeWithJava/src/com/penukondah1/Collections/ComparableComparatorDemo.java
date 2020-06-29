package com.penukondah1.Collections;

import java.util.TreeSet;

public class ComparableComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Betty",101);
		Employee e2 = new Employee("Archie",100);
		Employee e3 = new Employee("Jughead",102);
		Employee e4 = new Employee("Veronica",104);
		Employee e5 = new Employee("Reggie",103);
		Employee e6 = new Employee("Moose",105);
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		System.out.println(t); //default natural sorting of employee id's
		
		TreeSet t1 = new TreeSet(new MyComparatorEmployee()); // default natural sorting order of employee names
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		
		System.out.println(t1);
	}

}
