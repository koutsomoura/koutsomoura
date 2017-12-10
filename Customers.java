
public class Customers {
String name;
String username;
String number;
String street;
int numberofstreet;
String h;


	public Customers (String name,String username,String number,String street,int numberofstreet,String h){
		this.name=name;
		this.username=username;
		this.number=number;
		this.street=street;
		this.numberofstreet=numberofstreet;
		this.h=h;
	}
	public String getName(){
		return name;
	}
	public String getUsername(){
		return username;
	}
	public String getNumber(){
		return number;
	}
	public String getStreet(){
		return street;
	}
	public int getNumberofstreet(){
		return numberofstreet;
	}
	public String getHistory(){
		return h;
	}
	public String toString(){
		return ""+name+" , "+username+" , "+number+" , "+street+" "+numberofstreet+" ,History: "+h;
	}
}


