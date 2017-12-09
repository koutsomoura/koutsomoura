import java.util.Arrays;


public class Main {
		static int ne=1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodF []ob=new MethodF[2];
		
		ob[0]=new MethodF();
		ob[0].setFcost(50.5);
		ob[0].setLcost(80.9);
		ob[0].setCode(4236);
		
		ob[1]=new MethodF();
		ob[1].setFcost(200.5);
		ob[1].setLcost(335.6);
		ob[1].setCode(2523);
		
		for (int i=0;i<ob.length;i++){
		System.out.println(ob[i].toString());
		}
	}	
}
