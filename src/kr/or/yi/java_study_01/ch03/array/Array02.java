package kr.or.yi.java_study_01.ch03.array;

public class Array02 {

	public static void main(String[] args) {
		char[] chArr = new char[26]; //chArr이 0~25가 되어 prnArray로 감 
		prnArray(chArr);     // 이게 14번 라인으로 감 가서 수행을하고 지역변수에 대한 값은 끝남  chArr과 같은 값을 arr이 가르킴
		makeArray(chArr);    //  수행하고 지역변수에 대한 값이 끝남  chArr과 같은 값을 arr이 가르킴
		prnArray(chArr); 	 // 다시 chArr을 참조하는걸 만듬 9번줄은 별개의 메소드다
		//위치교환(swap)
		subArray(chArr);
		
		prnArray(chArr); //y z x.... a
	}

	private static void subArray(char[] arr) {
		char temp;
		for(int i=1; i<arr.length; i+=2) {
			temp = arr[i-1];
			arr[i-1]=arr[i];
			arr[i]=temp;
		}
	}

	private static void prnArray(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			
			System.out.printf("%c ", arr[i]);
		}
		System.out.println();
	
	}

	private static void makeArray(char[] arr) {
		char ch = 'z';
		for(int i=0; i<arr.length; i++) {
			arr[i]= ch--;
		}	
	}
}
