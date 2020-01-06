package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class Methodcall_1203 {

	public static void main(String[] args) {
		/*
		 * void_method(5); int res = return_method(3, 5); System.out.println("res = " +
		 * res);
		 * 
		 * 
		 * makeIntArray(5);
		 */

		int a = 5;
		int b = 3;
		System.out.printf(" 변경 전 a = %d,  b = %d %n", a, b);
		swap(a, b);
		System.out.printf(" 변경 후 a = %d,  b = %d %n", a, b);

		System.out.println();
		int[] arr = { 5, 3 };
		System.out.printf(" 변경 전 arr[0] = %d,  arr[1] = %d %n", arr[0], arr[1]);
		swap(arr);
		System.out.printf(" 변경 후 arr[0] = %d,  arr[1] = %d %n", arr[0], arr[1]);
	}

	private static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.printf("swap(int[] arr) ==>  arr[0] = %d,  arr[1] = %d %n", arr[0], arr[1]); // 바뀌고 나서도 그대로 유지가 됨
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("swap(int a, int b) a = %d,  b = %d %n", a, b);

	}

	private static void makeIntArray(int size) {
		int[] temp = new int[size];
		System.out.println(Arrays.toString(temp)); // Arrays.toString 배열 안에 쉽게 보는거

	}

	public static int return_method(int a, int b) {
		int c = a + b;
		return c; // 2개의 정수를 받아 int형으로 리턴해준다는 메소드

	}

	public static void void_method(int size) {

		System.out.println("size = " + size);
		return;

	}

}
