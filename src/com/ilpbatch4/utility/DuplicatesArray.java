package com.ilpbatch4.utility;

public class DuplicatesArray {

	public static void main(String[] args) {
		int array[]= {1,2,1,3,4};
		System.out.println("Duplicate elements in given array: ");
		duplicatesArray(array);
	}

	private static void duplicatesArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j])
					System.out.println(array[j]);
			}
		}
		
	}

}
