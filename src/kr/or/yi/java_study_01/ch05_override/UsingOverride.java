package kr.or.yi.java_study_01.ch05_override;

public class UsingOverride {
//	static void paint(Shape p){
//		p.draw();
//	}
	public static void main(String[] args) {
		Shape start;
		Shape last;
		Shape obj;
		
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		
		Shape p = start;
		while(p !=null) {
			p.draw();
			p = p.next;
		}
		
	}
	
	
	public static void array_to(String[] args) {
		Line line = new Line();
		Shape[] shapes = {line, new Line(), new Rect(), new Circle()};
		for(Shape s : shapes) {
			paint(s);
		}
		
//		Line line = new Line();
//		paint(line);
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());
		}

	private static void paint(Shape p) {
		p.draw();
		
	}

	}


