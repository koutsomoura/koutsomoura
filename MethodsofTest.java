
public class MethodsofTest {

	private int code;
	private String name;
	private double money;
	int bonus;
	double promithia;
	
	public MethodsofTest(int code,String name,int money){
		this.code=code;
		this.name=name;
		this.money=money;
		bonus=0;
		promithia=0;
	}
	
	public  MethodsofTest[] P(MethodsofTest a[]){
		
		if (code==1){
			double ek=0.10;
			promithia=money*ek;
		}
		else if (code==2){
			double ek=0.2;
			promithia=money*ek;
		}
		else if (code==3){
			double ek=0.3;
			promithia=money*ek;
			bonus=2000;
		}
		this.promithia=promithia;
		return a;
	}
	public String toString(){
		return code+" "+name+" "+money+" "+promithia+" "+bonus;
	}

}
