import java.util.*;
public class Vector4 {

	/**
	 * @param args
	 * @param object 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Object> v=new Vector<Object>(); //ti einai auto to Object?
		int primitiveType=20;
		String str="Maria";
		Integer wrapperType=new Integer(50);
		
		v.add ( primitiveType);
		v.add(str);
		v.add(wrapperType);
	
		System.out.println("O pinakas v einai "+v);
		for(int i=0;i<v.size();i++){
			System.out.println("v["+i+"]="+v.elementAt(i));
		}
		System.out.println("H xwritikothta tou v einai "+v.capacity());
		System.out.println("To megethos tou v einai "+v.size());
		Object i=v.firstElement();
		System.out.println("To arxito stoixeio einai to "+i);
		Object d=v.lastElement();
		
		System.out.println("To stoixeio tou vector sitn thesh 2 (i=1) einai "+v.elementAt(1));
		System.out.println("to teleutaio stoixeio einai to "+d);
		
		
		System.out.println("Einai o vector adeios? "+v.isEmpty());
		
		
		v.set(1, 53);
		System.out.println("Antikatestise to stoixeio stin thesi 1 me 53 "+"\n"+v);
		v.removeElementAt(1);
		Enumeration e=v.elements();
		System.out.println("Meta tin diagrafi tou 1ou stoixeiou"+v);
		System.out.println("Ta stoixeia tou vector : "+v);
		while (e.hasMoreElements()){
			System.out.println("Ta soixeia eiani "+e.nextElement());
		}
	
	}

}
