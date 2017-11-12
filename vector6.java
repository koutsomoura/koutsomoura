import java.util.*;
public class vector6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(21);
		v.addElement(34);
		v.addElement(1235.3);
		System.out.println(v);
		
		Vector a=(Vector) v.clone();
		System.out.println(a);
		
		Vector c=a;
		System.out.println(c);
		
		
		
	}

}
