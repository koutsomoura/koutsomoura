
public class box {

	
		double width;
		double height;
		double depth;
		double volume;
	
	public box(double x,double y,double z){
		System.out.println("Constructing BOX");
		this.width=x;
		this.height=y;
		this.depth=z;
	}
	public double volume(){
		return width*height*depth;
	}
}
	


