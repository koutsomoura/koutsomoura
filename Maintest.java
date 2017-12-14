
public class Maintest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsofTest[]p=new MethodsofTest[3];
		
		p[0]=new MethodsofTest(1,"Anna",2000);
		p[1]=new MethodsofTest(2,"John",1000);
		p[2]=new MethodsofTest(3,"Kostas",1000);
	

		for (int i=0;i<p.length;i++){
				p[i].P(p);				
				System.out.println (p[i].toString());

				
				
		}
	}

}
