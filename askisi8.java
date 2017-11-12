import java.util.*;


public class askisi8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Double> s=new ArrayList<Double>();
		s.add(23.323);
		
		int size=s.size();
		System.out.println(size);
		

		ArrayList<String> names=new ArrayList<String>();
		names.add("CAT");
		names.add("bliking");
		int sizenames=names.size();
		System.out.println(sizenames);
		
		int index =names.indexOf("CAT");//Den bgazei apotelesma
		System.out.println(index);
		
		for (int i=0;i<names.size();i++){
			String stoixeio=names.get(i);
			System.out.println("to stoixeio sthn thesi ["+i+"] einai :"+stoixeio);
			
		}
		for (String stoixeio:names){
			System.out.println("Stoixeio: "+stoixeio);
		}
		names.remove(1);
		System.out.println(names);
		
		if(names.size()==0){
			System.out.println("H lista einai adeia");}
		boolean result=names.isEmpty();
		System.out.println(result);
		
		ArrayList<String> clone=new ArrayList<String>();
		clone.addAll(names);
		System.out.println(clone);
		
		clone.add("DOG");
		clone.set(0,"SUN");
		System.out.println(clone);
		
		names.clear();
		System.out.println(names);
		
		/*ArrayList e=Arrays.asList(new String[]{"Alissa","Thomas","Nikolaou","Drakolaw"});//den bgainei*/
		
		
		String[] listArray=new String[clone.size()];
		System.out.println(listArray); //problima

		String[] aploArray=clone.toArray(listArray);
		System.out.println(aploArray); //problima
	}

}
