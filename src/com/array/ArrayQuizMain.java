package com.array;

public class ArrayQuizMain {
	static void doIt(int[] z){
		z = null;
	 // case - 1
//		z[0] = 99;
	// case - 2		
//		int[] A = z;
//		A[0] = 99;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		ArrayQuizMain.doIt(array);
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
