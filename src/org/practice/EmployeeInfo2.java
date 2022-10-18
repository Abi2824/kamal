package org.practice;

import java.util.LinkedList;
import java.util.List;

public class EmployeeInfo2 {
	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(10);
		
		System.out.println(li);
		
		//to find the length of list
		int size = li.size();
		System.out.println(size);
		
		//to find particular value from object
		Object object = li.get(4);
		System.out.println(object);
		
		//to remove particular value from index
		li.remove(2);
		System.out.println(li);
		
		//index based add()
		li.add(3,300);
		System.out.println(li);
		
		//replace value
		li.set(5, 500);
		System.out.println(li);
		
		//check particular value present or not
		boolean contains = li.contains(10);
		System.out.println(contains);
		
		//list empty or not
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		//get index based value
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		//Iterate list
		System.out.println("*****For loop****");
		
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i));
			
		}
		
		
		System.out.println("*****For each loop****");
		for (Object x : li) {
			System.out.println(x);
			
		}
		


		
	}

}

