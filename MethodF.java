
public class MethodF {

	private double fcost;
	private double lcost;
	int temaxia;
	private int code;
	
	public MethodF(){
		temaxia=Main.ne++;
		fcost=0.0;
		lcost=0.0;
		code=0;
	}
	public void seTemaxia(int temaxia){
		this.temaxia=temaxia;
	}
	public int getTemaxia(){
		return temaxia;
	}
	public void setFcost(double fcost){
		this.fcost=fcost;
	}
	public double getFcost(){
		return fcost;
	}
	public void setLcost(double lcost){
		if (lcost<100){
			lcost=lcost*0.8;
		}
		else if(lcost>100&&lcost<500){
			lcost=lcost*0.6;
		}
		this.lcost=lcost;
	}
	public double getLcost(){
		return lcost;
	}
	public void setCode(int code){
		this.code=code;
	}
	public int getCode(){
		return code;

	}
	public String toString(){
		return temaxia+" "+fcost+" "+lcost+" "+code;
	}
}