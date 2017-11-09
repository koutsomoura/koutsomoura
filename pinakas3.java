
public class pinakas3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={3,4,5,9,-1,-20,20,14};
		int max,min;
		max=array[0];
		min=0;
		for(int index=0;index<array.length;index++){
			if(array[index]>max){
				max=array[index];
			}
			if(array[index]<min){
				min=array[index];
			
			}
			}
			System.out.println(max);
			System.out.println	(min);
		
	}

}
