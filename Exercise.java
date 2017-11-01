
public class Exercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=1;
		do{
			num++;
			System.out.println("num= "+num);
		}while (num<14);
		num*=2;
		System.out.println("num= "+num);
		// TODO Auto-generated method stub
		
		int a=20;
		int b=2;
		int c;
		c=a*b;
		System.out.println("a*b="+c);
		c=a/b;
		System.out.println("a/b="+c);
		
		int f=10;
		int h=3;
		int g;
		g=f%h;
		System.out.println("a%b="+g);
		
		int i;
		double d=987.9634;
		i=(int)d; 
		System.out.println(i);
		
		int n;
		for (n=(-10);n<=10;n++){
			if (n>0){
				g=n%2;
					if (g==0){
					System .out.println("o arithmos "+n+" diairite akribos me to 2");
					}
					else{
					
					System.out.println("o arithmos "+n+" den diairite akribos me to 2");
					}
			}
			else if (n<0){
				h=n%2;
				if(h==0){
					System.out.println("o arithmos "+n+" diairite akribos me to 2");
				}
				else{
					System.out.println("o arithmos "+n+" den diairite akribos me to 2");
				}
			
			}
			else if (n==0){
				System.out.println("o arithmos "+n+" den diairite akribos me to 2");
				
			}
		}
		System.out.println("\n");
		int k;
		for (k=1;k<=20;k++){
			if (k%3==0){
				if(k%5==0){
					System.out.println(k+" diairite akribos kai me to 3 kai to 5");
				}
				else{			
				System.out.println(k+" diairite akribos me to 3");
				}

			}
			else if (k%5==0){
				System.out.println(k+" diairite akribos me to 5");
			}
			else if (k%3!=0){
				if (k%5!=0){
					System.out.println(k+" den diairite oute me to 3 oute me to 5");
				}
			}
			}
		}
		
		
	}
