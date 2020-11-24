package geometry;

public class Rectangle {

	private Point upperLeftPoint;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}
	
	public int area() {
		return height * width;
	}
	
	public boolean contains(int x, int y) {
		if (this.upperLeftPoint.getX() <= x &&
				this.upperLeftPoint.getY() <= y &&
				x <= this.upperLeftPoint.getX() + this.width &&
				y <= this.upperLeftPoint.getY() + this.height) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean contains(Point p) {
		if (this.upperLeftPoint.getX() <= p.getX() &&
				this.upperLeftPoint.getY() <= p.getY() &&
				p.getX() <= this.upperLeftPoint.getX() + this.width &&
				p.getY() <= this.upperLeftPoint.getY() + this.height) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocni = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocni.getUpperLeftPoint()) && 
					this.width == pomocni.getWidth() &&
					this.height == pomocni.getHeight()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public String toString() {
		return "Upper left point=" + upperLeftPoint + ", width=" + width + ", height=" + height;
	}
	
}
