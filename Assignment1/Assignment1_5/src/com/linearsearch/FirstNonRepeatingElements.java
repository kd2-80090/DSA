

package com.linearsearch;


public class FirstNonRepeatingElements {

	public static int linearSearch(int arr[]) {
		int key, count;
        for(int i = 0 ; i < arr.length-1; i++) 
        {
        	key=arr[i];
        	count=0;
        	for(int j = 0; j < arr.length-1; j++) {
        		if(key==arr[j])
        		{
        			++count;
        		}	
        	}
        	if(count==1) 		//here if element occurs only ones 
    			return i;
        }
		return -1;
	}
	
	public static void main(String[] args) {		
		
		int arr[] = { 1, 2, 2, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int res = FirstNonRepeatingElements.linearSearch(arr);
		System.out.println(arr[res]);
	}
}

