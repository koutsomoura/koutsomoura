
public class EmplA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmplM[] p1=new EmplM[4];
		
		for (int i=0;i<4;i++){
			System.out.println("Dose Onoma Ypallilou");
			String name=UserInput.getString();
			System.out.println("Sose meres ergasias");
			int meresergasia=UserInput.getInteger();
			System.out.println("Dose Hmeromisthio");
			double hmeromosthio = UserInput.getInteger();
			System.out.println("Dose Yperories");
			double yperories = UserInput.getInteger();
			p1[i] = new EmplM(name,meresergasia,hmeromosthio,yperories);
		
		}
		
		double p3[]=new double[4];
		p3=EmplM.methodAKM(p1);
		System.out.println("---------------------");
		
		for (int i=0;i<4;i++){
			System.out.println("Ta stoixeia ypallilou "+p1[i]+p3[i]);
		}
	}

}
