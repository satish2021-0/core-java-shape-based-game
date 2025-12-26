package shapeGameProject;

public class Cuboid implements ThreeDShape{
	
	double l;
	double b;
	double h;
	
	Cuboid(double l, double b, double h) {
		if (l > 0) {
			this.l=l;
		}
		else {
			System.out.println("Length must be positive.");
		}
		
		if (b > 0) {
			this.b=b;
		}
		else {
			System.out.println("Breadth must be positive.");
		}
		
		if (h > 0) {
			this.h=h;
		}
		else {
			System.out.println("Height must be positive.");
		}
	}
	
	
	@Override
	public double getVolume() {
		return l*b*h;
	}
	@Override
	public double getLateralSurfaceArea() {
		return 2*h*(l+b);
	}
	@Override
	public double getTotalSurfaceArea() {
		return 2*(l*b + b*h + h*l);
	}

}
