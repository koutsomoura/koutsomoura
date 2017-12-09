
public class Products {

	private int code;
	private int kf;
	private double fcost;
	private double lcost;
	private int temaxia;
	
	public Products(){
		code=0;
		kf=0;
		fcost=0.0;
		lcost=0.0;
		temaxia=0;
		
	}
	
	public void setCode(int code){
		this.code=code;
	}
	public int getCode(){
		return code;
	}
	public void setKf(int kf){
		this.kf=kf;
	}
	public int getKf(){
		return kf;
	}
	public void setTemaxia(int temaxia){
		this.temaxia=temaxia;
	}
	public int getTemaxia(){
		return  temaxia;
	}
	
	public void setFcost(double fcost){
		this.fcost=fcost;
	}
	public double getFcost(){
		return fcost;
	}
	
	public void setLcost(double lcost){
		if(kf==1){
			lcost=lcost+(lcost*0.14);
		}
		else if (kf==2){
			lcost=lcost+(lcost*0.24);
		}
		else if(kf==3){
			lcost=lcost+(lcost*0.30);
		}		

		this.lcost=lcost;
	
	}
	public double getLcost(){
		return lcost;
	}
	public double getSinolo(){
		double lcost1=0.0;
		double lcost2=0.0;
		int d=0;
		int a=temaxia/2;
		lcost1=a*lcost*0.5;
		double b=temaxia-a;
		lcost2=b*lcost;
		lcost=lcost1+lcost2;
		
		
		return lcost;
	}
	
	
	public String toString(){
		return code+"  "+kf+"  "+fcost+"  "+temaxia+"  "+lcost;
	}

}
