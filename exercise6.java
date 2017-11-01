
public class exercise6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double misthos=1293;
		double x,y;
		x =misthos/50;
		y =misthos%50;
		System.out.println("tha parei "+(int)x+" fores to nomisma 50 E");

		if (y!=0){
			misthos=y;
			x=misthos/20;
			y=y%20;	
			System.out.println("tha parei "+(int)x+" fores to nomisma 20 E");

			if (y!=0){
				misthos=y;
				x=misthos/5;
				y=y%5;
				System.out.println("tha parei "+(int)x+" fores to nomisma 5 E");

				if(y!=0){
					misthos=y;
					x=misthos/2;
					y=misthos%2;
					System.out.println("tha parei "+(int)x+" fores to nomisma 2 E");
					if(y!=0){
						misthos=y;
						x=misthos/1;
						y=misthos%1;
						System.out.println("tha parei "+(int)x+" fores to nomisma 1 E");
						if (y!=0){
							misthos=y;
							x=misthos/0.50;
							y=misthos%0.50;
							System.out.println("tha parei "+x+" fores to nomisma 0.50");
						}
					}
					
				}
			}
		}	
			
	}

}
