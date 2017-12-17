
public class Domic {

	private String name;
	private String surname;
	private String number;
	int e;
	
	public Domic(String name,String surname,String number){
		this.name=name;
		this.surname=surname;
		this.number=number;
		e=ObjectofDomic.e++;
	}
	public void setName(){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSurname(){
		this.surname=surname;
	}
	public String getSurname(){
		return surname;
	}
	public void setNumber(){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
}
