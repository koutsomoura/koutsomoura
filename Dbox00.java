public class Dbox00 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box00 mybox1=new box00();
		box00 mybox2=new box00();
		double vol;
		mybox1.width=4;
		mybox1.height=3;
		mybox1.depth=6;
		mybox2.width=2;
		mybox2.height=1;
		mybox2.depth=7;
		
		vol=mybox1.volume();
		System.out.println("  "+vol);
		vol=mybox2.volume();
		System.out.println("  "+vol);
		
	}


}
