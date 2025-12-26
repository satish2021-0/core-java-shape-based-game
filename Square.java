package shapeGameProject;

public class Square implements TwoDShape{
	
	double s;
	
	Square(double s){
		if(s>0)
			this.s=s;
		else
			System.out.println("Side Must be Positive");
		}
	
	public double getArea() {
		return s*s;
		
	}

	public double getPerimeter() {
		return 4*s;
	}

}
