package kr.or.yi.java_study_01.ch05;

class A {
	void prnA() {
		System.out.println("a");
	}
}

class B extends A {
	void prnB() {
		System.out.println("b");
	}

}

class C extends B {
	void prnC() {
		System.out.println("c");
	}
}

public class InstanceOfEx {

	public static void main(String[] args) {
//		instanceEx();

		A a = new A();
		B b = new B();
		C c = new C();

		prnObj(a);
		prnObj(b);
		prnObj(c);
	}

	private static void prnObj(A a) {
		// 최상위에서 받을수 있어서 매개변수 b도 c도 오류안뜸
		if (a instanceof C) {
			C cc = (C) a;
			cc.prnC();
		} else if (a instanceof B) {
			B bb = (B) a;
			bb.prnB();
		} else if (a instanceof A) {
			a.prnA();
		}
	}

	private static void instanceEx() {
		// A a = new C();
		// A a = new B();
		A a = new A(); // 부모는 자식을 참조 할 수 있지만
						// 자식은 부모를 참조 할 수 없다.

		if (a instanceof C) { // instanceof는 객체가 존재하는지를 묻는거
			System.out.println("a는 C의 객체를 가지고 있음");
		} else if (a instanceof B) {
			System.out.println("a는 B의 객체를 가지고 있음");
		} else if (a instanceof A) {
			System.out.println("a는 A의 객체를 가지고 있음");
		}
	}
}
