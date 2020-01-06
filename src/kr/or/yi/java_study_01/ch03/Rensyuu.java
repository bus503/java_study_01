package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Rensyuu {

	public static void main(String[] args) {
		int n = 0;
		while(n <= 10) {
			if(n%2 == 0) {
				n++;
				continue;
			}
			System.out.println(n++ + " ");
		}
		
	
		
	}

}
