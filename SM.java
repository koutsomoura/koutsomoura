
public class SM {

	public static void main(String[] args){
		for (int n=-10;n<=10;n++){
			if (n>0&&n%2==0){
				System.out.println(n+":  Einai megalitero tou mhdenos kai diairitai akribws me to 2");
			}
			else if(n>0&&n%2!=0){
				System.out.println(n+":  Einai megalitero tou mhdenos kai den diairitai akribws me to 2");
			}
			else if (n<0&&n%2==0){
				System.out.println(n+":  Einai mikrotero tou mhdenos kai diairitai akribws me to 2");
			}
			else if (n<0&&n%2!=0){
				System.out.println(n+":  Einai mikrotero tou mhdenos kai den diairitai akribws me to 2");

			}
			else if(n==0){
				System.out.println(n+": O arithmos einai 0");

			}
		}
		
		System.out.println("-----------------------------");
		for (int n=1;n<=20;n++){
			if (n%3==0){
				System.out.println(n+" :Diairitai akribos me to 3");
			}
			if (n%5==0){
				System.out.println(n+" :Diairitai akribws me to 5");
			}
			if (n%3==0&&n%5==0){
				System.out.println(n+" :Diairitai akribws me to 5 kai to 3");
			}
			if (n%3!=0&&n%5!=0){
				System.out.println(n+" :Den diairitai akribws me to 5 kai to 3");

			}
		}
		int n;
		n=4+(int)(Math.random()*997);
	}
}
