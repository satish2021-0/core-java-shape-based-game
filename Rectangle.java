package shapeGameProject;

public class Rectangle implements TwoDShape {
	double length;
	double width;

	Rectangle(double length, double width) {
		if(length>0 && width>0) {
			this.length = length;
			this.width = width;
		}else if(length<0 && width<0) {
			System.out.println("Lenght and width must not be negative");
		}else if(length<0) {
			System.out.println("Length must not be -ve");
			this.width=width;
		}else if(width<0) {
			System.out.println("Width must not be -ve");
			this.length=length;
		}
	}
	@Override
	public double getArea() {
		return length * width;
	}
	@Override	
	public double getPerimeter() {
		return 2 * (length + width);
	}

}