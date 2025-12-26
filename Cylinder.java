package shapeGameProject;

class Cylinder implements ThreeDShape{
	double r;
	double h;
	
	Cylinder(double r, double h){
		if (r > 0) {
			this.r=r;
		}
		else {
			System.out.println("Radius must be positive.");
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
		return Math.PI*r*r*h;
	}
	@Override
	public double getLateralSurfaceArea() {
		return 2*Math.PI*r*h;
	}
	@Override
	public double getTotalSurfaceArea() {
		return 2*Math.PI*r*(r+h);
	}

}