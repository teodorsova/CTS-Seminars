package l.resolved;

public class Square extends Shape{
	int side;
	
	public int getWidth() {
		return side;
	}
	public void setWidth(int width) {
		this.side = width;
	}
	
	public int getArea() {
		return this.side * this.side;
	}
}