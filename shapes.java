

class polygon{
	int sides;
	static int triangles;
	static int rectangles;
	public polygon(){
		this.sides = 0;
	}

	public polygon(int sides){
		this.sides = sides;
	}

	public void setSides(int sides){
		this.sides = sides;
		return;
	}

	public int getSides(){
		return sides; 
	}

	public static int triangles(){
		return triangles;
	}

	public static int rectangles(){
		return rectangles;
	}
}

class rectangle extends polygon{
	
	double width;
	double height;

	public rectangle(){
		super(4);
		this.width = 0;
		this.height = 0;
		rectangles += 1;
	}

	double getArea(){
		return this.width*this.height;
	}

	void setParameter(double w, double h){
		this.width = w;
		this.height = h;
	}	

}

class triangle extends polygon{
	
	double base;
	double perpendicular;
	double hyp;

	public triangle(){
		super(3);
		this.base = 0;
		this.perpendicular = 0;
		this.hyp = 0;
		triangles += 1;
	}

	double getArea(){
		return (this.base*this.perpendicular)/2;
	}

	void setParameter(double base, double per, double hyp){
		this.base = base;
		this.perpendicular = per;
		this.hyp = hyp;
	}	

}

public class shapes{
	public static void main(String args[]) {
		
		rectangle r1 = new rectangle();
		rectangle r2 = new rectangle();
		triangle t1 = new triangle();
		r1.setParameter(3,4);
		System.out.println ("Area = "+ r1.getArea());
		System.out.println("Sides = "+ r1.getSides());
		System.out.println("rectangles = "+ r1.rectangles());
		System.out.println("triangles = "+ t1.triangles);	
	}
}