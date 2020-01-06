package kr.or.yi.java_study_01.ch05_task;


class StringStack implements Stack{
	Exam01Main a = new Exam01Main();
    private int capacity; //저장 용량
    private int length;   //저장된 아이템의 개수
    private String[] strArr;	
    
    
	public StringStack(int capacity) {
		this.capacity = capacity;
		this.strArr = new String[capacity];
	}

	@Override
	public int length() {
 
		return length;
	}

	@Override
	public int capacity() {
		
		return capacity; //3이 되어야함
	}

	@Override
	public String pop() {
		if(length ==0) {
			System.out.println("스택이 비어서 pop불가!");
			   return null; //문자열객체기 때문에 null로 리턴
		}
		return this.strArr[--length];
	}

	@Override
	public boolean push(String val) {
		if(capacity == length) {
			System.out.println("스택이 가득차서 푸시불가!");
		   return false;
		}
		this.strArr[length++] = val;
		return true;
	}
	
	
}
