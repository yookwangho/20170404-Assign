class Cylinder {
	Circle ce = new Circle(2.8);
	double h = 5.6;
	
}
public class Circle {
	public double radius;
	public static double PI = 3.141592;
	
	public Circle(double radius){
		this.radius= radius;
	}
	
	public double getArea(){
		return radius * radius * PI;
	}
	
 
	public static void main(String[] args) {
		Circle ce = new Circle(2.8);
		double h = 5.6;
		
		System.out.println("ºÎÇÇ:"+ce.getArea()*h);


	}

}
