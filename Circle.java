package shapeGameProject;

public class Circle implements TwoDShape{
	double r;
	Circle(double r){
		if (r > 0) {
			this.r=r;
		}
		else {
			System.out.println("Radius must be positive.");
		}
		
	}
	
	public double getArea() {
	return Math.PI*r*r;
	}
	
	public double getPerimeter() {
	return 2*Math.PI*r;
	}
	

}