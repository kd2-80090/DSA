package com.employee;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
	
	public static void insertionSort(Employee arr[],int N) {
		for(int i=1;i<N;i++) {
			double temp = arr[i].getSalary();
			int j=i-1;
			while(j>=0 && arr[j].getSalary()>temp) {
				double sal =arr[j+1].getSalary();
				 sal= arr[j].getSalary();
				 
				j--;
			}
			double salAssign = arr[j+1].getSalary();
			salAssign=temp;
			
		}
	}
	
	public static void main(String[] args) {

		Employee e1 = new Employee(1,"Nilesh",80000.0);
		Employee e2 = new Employee(2,"Nitin",60000.0);
		Employee e3 = new Employee(3,"Suyash",70000.0);
		
		Employee arr[] = {e1,e2,e3};
		
		insertionSort(arr,arr.length);
		
		for (Employee employee : arr) {
			System.out.println(employee);
		}
		
//		System.out.println(Arrays.toString(arr));
		
	}
}