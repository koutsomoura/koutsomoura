
public class exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a=4+(int)(Math.random()*100);
		b=4+(int)(Math.random()*100);
		if(a!=b){

		System.out.println("a="+a+"    b="+b);
			if (a>b){
				
			}
			else if (a<b){
				int temp;
				temp=a;
				a=b;
				b=temp;
				System.out.println("a="+a+"  b="+b);
			}
			
			int z;
			do{
			z=a%b;
			a=b;
			b=z;
			}while (z==0);
			System.out.println(b);
			
	}
		
	}
}
