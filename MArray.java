import java.util.*;
public class MArray {

	public static void Array1(){
		int kelia=getRandom();
		System.out.println("Dhmioyrgia monodiastatou pianaka me "+kelia+" arithmo kelion");
		System.out.println("------------");
		int Pinakas[]=new int[kelia];
		
		for (int i=0;i<Pinakas.length;i++){
			Pinakas[i]=getRandom();
			System.out.println("Emfanisi toy monodiastatou pinaka");
		for( i=0;i<Pinakas.length;i++)
			System.out.println("keli ["+i+"]= "+Pinakas[i]);
			System.out.println();

		}
	}
	public static void Array2(){
		int x=getRandom();
		int y=getRandom();
		System.out.println("Dhmiourgia diasdistatou pinaka me "+x*y+" kelia ");
		System.out.println("----------------");
		int Pinakas[][]=new int[x][y];
		for (int i=0;i<x;i++){
			for (int j=0;j<y;j++)
				Pinakas[i][j]=getRandom();
				System.out.println("Emfanisi toy didiastatou pinaka");

		for (i=0;i<x;i++)
			for(int j=0;j<y;j++)/* den me afinei an den labw int*/
				System.out.println("keli ["+i+"]["+j+"]= "+Pinakas[i][j]);
		}
	
	}
	private static int getRandom(){
		Random rand=new Random();
		return rand.nextInt(10);	
	}
	public static void main(String[] args){
		Array1();
		Array2();
	}
}


