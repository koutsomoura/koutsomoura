
public class askisi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gramma;
		String name="Karaxatzi Maria";
		
		StringBuffer buff=new StringBuffer(name);
		int mikos=buff.length();

		for(int i=0;i<mikos;i++){
			gramma=buff.charAt(i);
			if (gramma=='A'||gramma=='a'||gramma=='I'||gramma=='i'||gramma=='E'||gramma=='e'||gramma=='O'||gramma=='o'||gramma=='U'||gramma=='u');{
			
				buff.setCharAt(i,'4');/*lathos*/
			}
		}
		System.out.println(buff);
	
	}
}
