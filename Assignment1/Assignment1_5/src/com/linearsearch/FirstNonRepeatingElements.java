

package com.linearsearch;

import java.util.Scanner;

public class FirstNonRepeatingElements {

	public static int linearSearch(int arr[]) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
				if(count==0)
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter key to get rank : ");
		int key = sc.nextInt();
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int res = FirstNonRepeatingElements.linearSearch(arr);
		System.out.println(res);
	}
}

