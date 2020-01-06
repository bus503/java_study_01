package kr.or.yi.java_study_01.ch05_task;
class Add extends Calc{
	@Override
	public int calculate() {
		return a + b;
	}
	
}
class Mul extends Calc{

	public int calculate() {
		return a * b;
	}
}
class Sub extends Calc{

	public int calculate() {
		return a - b;
	}
	
}
class Div extends Calc{

	public int calculate() {
		return a / b;
	}
	
}

public abstract class Calc {
	protected int a;
	protected int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public abstract int calculate();
}