
public class Mine2 {
	private int number;
	private String name;
	private String code;
	private String allname;
	private int apostoles;

	public Mine2(int number, String name,String code){
		this.number=0;
		this.name="";
		this.code="";
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return number;
	}
	public void setName(){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setCode(){
		this.code=code;
	}
	public String getCode(){
		return code;
	}
	public String getAllname(){
		String a=name+code;
		this.allname=a;
		return allname;
	}
	public int getApostoles(){
		int t=(number-2)*101;
		this.apostoles=t;
		return apostoles;
	}
	public String toString(){
		return String.format("%-10s %-10s %-10s %-10s %-10s",number,name,code,allname,apostoles);
		
	}


}
