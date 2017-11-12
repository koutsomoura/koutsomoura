import java.util.*;
public class askisi9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();
		list.add("23");
		list.add("45");
		list.add("65");
		System.out.println("H lista me tin prosthiki 3-stoixeion: "+list);
		
		list.add(3,"PLUS");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}

}
