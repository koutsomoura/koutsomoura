
public class sum {

	int a;
	int b;
	
	public sum(int i,int d){
		a=i;
		b=d;
	}
	public  void meth(sum k){
		k.a=a*2;
		k.b=b/2;
	}
	
	
	//public sum(int x1,int y2){
		//x=x1;
	//	y=y2;
	//}
	
	public static void Sum(int num1,int num2){
		int result=num1+num2;
		System.out.println(result);

	}



}