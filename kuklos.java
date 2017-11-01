
public class kuklos {
	private int radius=0;
	
	public void setRadius(int y){
		radius=y;
	}
	public int getRadius(){
		return radius;
	}
	public int getDiametro(){
		
		return (2*radius);
	}
	public double getArea(){
		return ((int)(3.14*radius*radius));

	}
}
