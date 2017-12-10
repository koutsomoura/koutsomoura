import java.util.Arrays;

public class Prod {
	
	public static void main(String[] args) {
		
		Methodofp []a=new Methodofp[3];
		
		
		
		a[0]=new Methodofp(10,20,423,1);
		a[0].setDiscount();
		
		
		
		a[1]=new Methodofp();
		a[1].setFcost(60);
		a[1].setLcost(100);
		a[1].setCode(2341);
		a[1].setKf(1);
		a[1].setDiscount();
		
		a[2]=new Methodofp(a[1].getFcost(),a[1].getLcost(),a[1].getCode(),a[1].getKf(),a[1].getDiscount());
		
		for(int i=0;i<a.length;i++){
			a[i].toString();
			System.out.println(a[i]);
		}

		
	}
}
		/*for(int i=0;i<a.length;i++) {	
		a[i]=new Methodofp(1+(Math.random()*100),1+(Math.random()*100),1+(int)(Math.random()*100),1+(int)(Math.random()*100));
		
		/*a[i]=new Methodofp(1+(Math.random()*100),1+(Math.random()*100),1+(int)(Math.random()*100),1+(int)(Math.random()*100),1+(Math.random()*100));
		
		/*a[i]=new Methodofp();
		a[i].setFcost(1+(Math.random()*100));
		a[i].setLcost(1+(Math.random()*100));
		a[i].setCode(1+(int)(Math.random()*100));
		a[i].setKf(1+(int)(Math.random()*100));
		a[i].setDiscount(1+(Math.random()*100));*/
