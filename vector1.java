import java.util.Vector;


public class vector1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement(new Integer(24));
		v.addElement(new Float(3.232));
		System.out.println(v);
	
		for (int i=0;i<v.size();i++){
			System.out.println("v["+i+"]="+v.elementAt(i));
			
			
		}
	}

}
