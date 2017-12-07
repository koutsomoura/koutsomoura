
public class SumOb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o=2;
		int e=3;
		sum numder=new sum(o,e);
		
		numder.Sum(2,3);
		
		sum crazy=new sum(4,6);
		System.out.println(crazy.a+crazy.b);
		crazy.meth(crazy);
		System.out.println(crazy.a+crazy.b);

	}

}
