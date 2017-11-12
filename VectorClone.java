import java.util.*;
public class VectorClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a=new Vector();
		a.addElement(new Integer(100));
		a.addElement(new Integer(200));
		a.addElement(new Integer(300));
		
		Vector b=(Vector)a.clone(); //GT\??
		
		System.out.println("O Vector b einai to antigrafo toy a: ");
		System.out.println(b);
		
		System.out.println("O vector c=a: ");
		Vector c=b;
		System.out.println(c);
		
	}

}
