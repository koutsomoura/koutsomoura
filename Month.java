import java.io.*;


public class Month {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		int month,year,days;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Dwse ton aritmo tou mhna: ");
		month=Integer.parseInt(br.readLine());
		System.out.println();
		System.out.print("Dwse etos: ");
		year=Integer.parseInt(br.readLine());
		System.out.println();
		switch (x){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			month=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			month=30;
			break;
		}
		System.out.println("O minas exei "+x+" meres.");
		if (year%4==0){
			if(year%100==0){
				if(year%400==0){
					days=29;
					System.out.println("Einai disekto "+days+"meres");
				}else{
					days=28;
					System.out.println("Den einai disekto"+days);
				}
			}else{
				days=29;
				System.out.println("einai disekto"+days);
				}
		}else{
			System.out.println("den einai disekto");}
		
		



	
		
			
		
		
		if (((year%4==0)&&!(year%100==0))||(year%400==0)){
			days=29;
		}else{
			days=28;
		}
		if (days==29){
			System.out.println("Einai disekto etos");
		}else{
			System.out.println("Den einai disekto");
		}
	
		
	}
}


		
		