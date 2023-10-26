package com.employee;

import java.util.Scanner;

public class Tester {

	public static Employee binarySearchByEmpid(Employee arr[],int size,int key) {
		int left=0,right=size-1,mid;
		while(left<=right) {
			mid=(left+right)/2;
			
			if(key==arr[mid].getEmpid())
				return arr[mid];
			else if(key<arr[mid].getEmpid())
				right=mid-1;
			else				//key>arr[mid].getEmpId()
				left=mid+1;
		}
		return null;
	}
	
	public static int linearSearchByEmpName(Employee arr[],int size, String key) {
		for(int i =0;i<=size-1;i++) {
			if(key.equals(arr[i].getName()))
				return i;
		}
		return -1;
	}
	
	public static Employee linearSearchByEmpSalary(Employee arr[],int size, double key) {
		for(int i =0;i<=size-1;i++) {
			if(key==arr[i].getSalary())
				return arr[i];
		}
		return null;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(1,"Nilesh",80000.0);
		Employee e2 = new Employee(2,"Nitin",60000.0);
		Employee e3 = new Employee(3,"Suyash",70000.0);
		
		Employee arr[] = {e1,e2,e3};
		
		//Binary Search By Empid
		System.out.println("Enter employee id to be searched : ");
		
		int id = sc.nextInt();
		Employee res = Tester.binarySearchByEmpid(arr, arr.length, id);
		
		if(res!=null) {
			System.out.println("Employee found...");
			System.out.println("Employee details : "+res);
		}
		else
			System.out.println("Employee not found.");
		
		//Linear Search By EmpName
		System.out.println("Enter employee name to be searched : ");
		
		String name = sc.next();
		int res1 = Tester.linearSearchByEmpName(arr, arr.length, name);
		
		if(res1!=-1) {
			System.out.println("Employee found...");
			System.out.println("Employee details : "+arr[res1]);
		}
		else
			System.out.println("Employee not found.");
		

		//Linear Search By EmpName
		System.out.println("Enter employee salary to be searched : ");
				
		double salary = sc.nextDouble();
		Employee res2 = Tester.linearSearchByEmpSalary(arr, arr.length, salary);
				
		if(res2!=null) {
			System.out.println("Employee found...");
			System.out.println("Employee details : "+res2);
		}
		else
			System.out.println("Employee not found.");
						
	}
}
