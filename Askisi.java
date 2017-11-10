
public class Askisi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] NameArray={'C','A','T'};
		String NameString=new String(NameArray);
		System.out.println(NameString);

		
		
		char gramma;
		String name="Nikos Nikas";
		int arXaraktiron=name.length();
		int metritis=0;
		for(int i=0;i<arXaraktiron;i++){
			gramma=name.charAt(i);
			if (gramma=='A'||gramma=='a'||gramma=='E'||gramma=='e'||gramma=='I'||gramma=='i'||gramma=='O'||gramma=='o'||gramma=='U'||gramma=='u'){
				metritis++;
			}
		}
	System.out.println("To onoma: "+name+" exei "+metritis+" fonienta");
	}

}
