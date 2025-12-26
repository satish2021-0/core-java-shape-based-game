package shapeGameProject;

public class Cube implements ThreeDShape {
		double s;
		
		Cube(double s){
			if (s > 0) {
				this.s=s;
			}
			else {
				System.out.println("Side must be positive.");
			}
		}
	@Override
	public double getVolume() {
		return s*s*s;
	}
	@Override
	public double getLateralSurfaceArea() {
		return 4*s*s;
	}
	@Override
	public double getTotalSurfaceArea() {
		return 6*s*s;
	}
}
