
public class TestLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={3,6,7,9,0,8};
		for(int x:num){
			System.out.print(x);
			System.out.print(" , ");
			
		}
		System.out.print("\n");
		String[] name={"Anna","Kelly","Jon","Ahri"};
		for (String namex:name){
			System.out.print(namex);
			System.out.print(" ,");
		}
		System.out.print("\n");
	
		double b=8;
		b=b*0.4567;
		if (b>1){
			System.out.println("true");}
		else{
				System.out.println("false\n");
			
			}
		char grade= 'p';
		switch(grade){
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
		case 'D':
			System.out.println("Well done");
			break;
		case 'F':
			System.out.println("Try again");
		default:
			System.out.println("crazy\'things\' fa");
		}
	String thesi="O PARIS EINAI AUSTRIA";
	char result = thesi.charAt(2);
	System.out.println(result);
	
	
	}
	

}
