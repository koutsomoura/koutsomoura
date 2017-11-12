import java.util.*;


public class Vector3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector(10);
		v.addElement(new Integer(24));
		v.addElement(new Float(2.123));
		ListIterator it =v.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Efarmogh ths Enumeration()......");
		Enumeration e=v.elements();
		System.out.println("The elements of vector: "+v);
		while(e.hasMoreElements()){
			System.out.println("The elements are: "+e.nextElement());
		}
	
	}

}
