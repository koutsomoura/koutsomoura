public class Methodofp {
	private double fcost;
	private double lcost;
	private int code;
	private int kf;
	private double discount;

	public Methodofp() {
		fcost=0.0;
		setLcost(lcost);
		code=0;
		kf=0;
		discount=0.0;
	}
	public Methodofp(double fcost,double lcost,int code,int kf,double discount) {
		this.fcost=fcost;
		this.lcost=getLcost();
		this.code=code;
		this.kf=kf;
		this.discount=discount;
	}
	public Methodofp(double fcost,double lcost,int code,int kf) {
		this.fcost=fcost;
		this.lcost=getLcost();
		this.code=code;
		this.kf=kf;
		discount=0.0;
		}
	public void setFcost(double fcost) {
		this.fcost=fcost;
	}
	public double getFcost(){
		return fcost;
	}
	public void setKf(int kf ) {
		this.kf=kf;
	}
	public int getKf(){
		return kf;
	}

	public void setLcost(double lcost) {
		if (kf==1) {
			double ek=lcost*0.25;
			lcost=lcost+ek;
		}
		else if(kf==2) {
			lcost=lcost+(lcost*0.10);
		}
		this.lcost=lcost;
	}
	public double getLcost(){
		return lcost;
	}
	public void setCode(int code) {
		this.code=code;
	}
	public int getCode(){
		return code;
	}
	
	public void setDiscount() {
		double result=lcost;
		if(fcost>50){
			result=result-(result*0.50);
		}else{
			result=result;
		}
		
		discount=result;
	}	
	public double getDiscount(){
		return discount;
	}
	public String toString(){
		return  fcost+"  "+lcost+"  "+code+"  "+kf+"  "+discount;
	}
}
