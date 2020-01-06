package kr.or.yi.java_study_01.ch05_irontask;

import kr.or.yi.java_study_01.ch05_irontask.A.B;
import kr.or.yi.java_study_01.ch05_irontask.A.C;

	class A{
		private int a;

		public void set(int a) {
			this.a = a;
		}
		
		class B extends A {
			protected int b;
			protected int c;
		}
		
		class C extends B {
			public int d,e;
		}
			
		public class Q1 {
		
		public void main(String[] args) {
			A objA = new A();
			B objB = new B();
			C objC = new C();
			
		}
	}
	}

