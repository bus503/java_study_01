package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class Array001_1204 {

	public static void main(String[] args) {
//		copy();
		

	}

	
	private static void copy() {
		int [] arr01 = {1,2,3,4,5};
		int [] arr02 = new int[5];
		
		System.out.println(Arrays.toString(arr02));
		
		System.arraycopy(arr01, 0, arr02, 0, 2);
		System.out.println(Arrays.toString(arr02));
	}

}
