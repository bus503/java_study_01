package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class Array04_1202 {

	public static void main(String[] args) {
		Random rnd = new Random(1234567);
		int[] arr = new int[6];
		System.out.println(Arrays.toString(arr));

		init_Lotto(rnd, arr);

		// 간단한 배열 출력
		System.out.println(Arrays.toString(arr));
		
		bubble_sort(arr);
		
		System.out.println(Arrays.toString(arr)); // 15 17 27 33 36 43
		
		
		int searchKey = 90;
		int findIdx = findSearch(arr, searchKey);
		System.out.printf("%s 배열에서 %d의 위치는 %d 입니다.", Arrays.toString(arr),searchKey, findIdx);
	
		findIdx = binarySearch(arr,searchKey);
		System.out.printf("%n%s 배열에서 %d의 위치는 %d 입니다.", Arrays.toString(arr),searchKey, findIdx);
	}
	

	private static int binarySearch(int[] arr, int searchKey) {
		int mid = 0;
		int left = 0; 
		int right = arr.length-1;
		while(left <= right) {
			
			if(arr[mid] > searchKey){
				right = mid - 1;
			}
			if(arr[mid] < searchKey) {
				left = mid + 1;
			}
			if(arr[mid] == searchKey){
				return mid;
			}
			mid=(left+right)/2;
		}			
	return -1;                     //이분검색으로 풀어봤다 findSearch보다 더 수행시간이 짧아짐
}

	private static int findSearch(int[] arr, int searchKey) {
		// arr배열에서 searchKey가 존재하면 존재하는 위치 리턴, 존재하지 않는 경우 -1 리턴
		
		for(int i = 0; i<arr.length; i++) {
			if(searchKey == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	private static void bubble_sort(int[] arr) {
		int temp;
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length-(j+1); i++) {
				 if(arr[i] > arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				 }
			}
			System.out.println(Arrays.toString(arr));
		}
		
}

	private static void init_Lotto(Random rnd, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(46) + 1;
		}
	}

	private static void generate_number() {
		Random rnd = new Random();
		rnd.setSeed(1234);
		for (int i = 0; i < 6; i++) {
			System.out.print(rnd.nextInt(45) + 1 + " "); // 0 <= rnd.nextInt(45) < 45
		}
	}
}
