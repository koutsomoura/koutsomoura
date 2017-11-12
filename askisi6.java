
public class askisi6 {

	/**
	 * @param args
	 */
	public static <A> void printArray(A[] inputArray) {

		for (A element:inputArray){
			System.out.print(element+" ");
		}
		System.out.println();
		}

	public static void main(String args[]){
		Character[] charArray={'J','A','V','A'};
		Double[] doubleArray={2.1, 5.3, 1.2, 8.4};
		Integer[] intArray={4, 32,45,67,89};
		
		System.out.println("Pinakas xaraktiron: ");
		printArray(charArray);
		System.out.println();
		System.out.println("Pinakas dekadikon: ");
		printArray(doubleArray);
		System.out.println();
		System.out.println("Pinakas akeraion: ");
		printArray(intArray);
	}
}
