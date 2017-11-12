import java.util.*;
public class askisi12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList array=new ArrayList();
		array.add("5");
		array.add("3");
		array.add("9");
		
		boolean search=array.contains("4");
		System.out.println(search);
		
		
			int i=array.indexOf("9");
			if (i==-1){
				System.out.println("H lista den perixexei to stoixeio  5  ");
				
			}else {
				System.out.println("H lista periexei to stoixeio 9 stin thesi"+i);
			}

		}
	
	

}
