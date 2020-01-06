package CH04Main_Q;

public class Rectangle {
	public int x;
	public int y;
	public int width;
	public int height;
	

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() { // 사각형의 좌표, 넓이를 화면에 출력
		System.out.printf("(%s,%s)에서 크기가 %s*%s인 사각형%n", x, y, width, height);

	}

	public int square() { // 사각형의 넓이를 리턴
		return width * height;
	}

	public boolean contains(Rectangle r) {
		if((x < r.x && y < r.y) && (x+width > r.x+r.width && y+height> r.y+r.height)) {
			
			return true;
		}else {
			
			return false;
		}
	}
}
