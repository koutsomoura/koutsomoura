
public class Mine {

	/**
	 * @param args
	 */
	private double lastcost;
	private double firstcost;
	double fpa;
	private int code;
	
	public Mine(double firstcost,double fpa,int code){
		this.firstcost=firstcost;
		this.fpa=fpa;
		this.code=code;
	}
	
	public void setCode(int code){
		this.code=code;
	}
	public int getCode(){
		return code;
	}
	public void setFpa(double fpa){
		this.fpa=fpa;
	}
	public double getFpa(){
		return fpa;
	}
	public void setFirstcost(double firstcost){
		this.firstcost=firstcost;
	}
	public double getFirstcost(){
		return firstcost;
	}
	
	public double getLastcost(){
		double d=fpa/100.0;
		lastcost=firstcost+d;
		return lastcost;
	}
	public String toString(){
		return String.format("%-10s %-10s %-10s%-10s",firstcost,fpa,code,lastcost);
	}
	
}
