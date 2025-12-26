package shapeGameProject;

public class Sphere implements ThreeDShape{
	double r;
	Sphere(double r){
		if (r > 0) {
			this.r=r;
		}
		else {
			System.out.println("Radius must be positive.");
		}
		
	}
	@Override
	public double getVolume() {
	return (4.0/3.0)*Math.PI*r*r*r;
	}
	@Override
	public double getLateralSurfaceArea() {
	return 4*Math.PI*r*r;
	}
	@Override
	public double getTotalSurfaceArea() {
	return 4*Math.PI*r*r;
	}

}