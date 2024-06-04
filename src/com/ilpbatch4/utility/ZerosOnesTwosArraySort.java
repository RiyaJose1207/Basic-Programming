package com.ilpbatch4.utility;

public class ZerosOnesTwosArraySort {

	public static void main(String[] args) {
		int array[]= {1,2,0,1,1,0};
		arraySort(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");}

	}

	private static void arraySort(int[] array) {
		int low=0;
		int mid=0;
		int high=array.length-1;
		while(mid<=high) {
			switch(array[mid]){
			case 0:
				int tempi=array[low];
				array[low]=array[mid];
				array[mid]=tempi;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int tempf=array[high];
				array[high]=array[mid];
				array[mid]=tempf;
				high--;
				break;
			}
		}
		
		
	}

}
