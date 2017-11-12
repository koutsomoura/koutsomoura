import java.util.*;
public class vector5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[]={"H","hmeromonia","einai","17/11/2018"}; 
		Vector v=new Vector();
		
		for (int i=0;i<data.length;i++){
			v.add(data[i]);
			System.out.println(v.elementAt(i));
		}
		System.out.println(v);
		System.out.println("Yparxei to 'Me'?"+v.contains("Me"));
		int x=v.indexOf("H");
		System.out.println(x);
		System.out.println(v.lastIndexOf("H")); ///Index of?
		v.remove(1);
		System.out.println(v);
		v.remove("H");
		System.out.println(v);
		v.add(1,"apo aurio tha einai");
		System.out.println(v);
		
		System.out.println("to i me tin get(): "+v.get(1));
		
		System.out.println("to i me tin elementAt(): "+ v.elementAt(1));
	}

}
