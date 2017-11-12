import java.util.*;
public class Vector2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector(1);
		System.out.println("H arxiki xoritikotita einai: "+v.capacity());
		String s1="Nikos";
		String s2="Takis";
		String s3="Giannis";
		Integer t=new Integer(4);
		
		System.out.println("Xrisi tis addElement().....");
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		
		for(int i=0;i<v.size();i++){
			System.out.println("v["+i+"]="+v.elementAt(i));
		}
		
		System.out.println("Xrisi tis insertElementAt().....");
		v.insertElementAt(t,3);
		for (int i=0;i<v.size();i++){
			System.out.println("v["+i+"]="+v.elementAt(i));
		}
		System.out.println("H nea xoritikotita einai: "+v.capacity());
		System.out.println("To stoixio sthn prwti thesi einai :"+v.firstElement());
		System.out.println("to stoixio sthn teleutaia thesi enai: "+v.lastElement());
		
		System.out.println("Topothetisi tou Tasos sti thesi-2 meti setElementAt()");
		v.setElementAt("Tasos", 2);
		for (int i=0;i<v.size();i++){
			System.out.println("v["+i+"]="+v.elementAt(i));
		}
		System.out.println("Diagrafi ou 4ou -stoixeiou(i=3)");
		v.remove(3);
		for (int i=0;i<v.size();i++){
			System.out.println("v["+i+"]="+v.elementAt(i));
		}
	
	}

}
