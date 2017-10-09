



public class NumD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	char[] copy={'3','5','6','4','8','9','2','5','4'};
	char[] paste= new char[5];
	System.arraycopy(copy,0,paste,0,3);
	System.out.println(new String(paste)); 
	String noumera=new String(paste);
	
	String[] mark={"D&G","DD","MED"};
	String[] size={"64","55","70"};
	for (int i=0;i<mark.length;i++){
		for (int j=0;j<size.length;j++){
		String teliko= "The mark is "+mark[i]+" and the size of the pants is "+size[j];
		
	
		/*System.out.print(teliko);*/
	
		String give=teliko+" code: "+noumera;
		System.out.println(give);
		}
	}
	int[] ko=new int[10];
	
	for (int i=0;i<ko.length;i++){
			if (i!=0){
				int a;
				a=i*9;
				System.out.println(a);
			}
			else {
				System.out.println("The program is strasrting");
			}
		}
	}
	}
	

	
			
		
		
		
	
