
public class syskeyes {

	final String ypokatasthma="Ypokatasthma Thessalonikis";
	private int arithmosSyskeyhs;
	private double arxikhTimhSyskeyhs;
	private double telikhTimhSyskeyhs;
	
	//Domhths kenos//
	public syskeyes(){
		arithmosSyskeyhs=0;
		arxikhTimhSyskeyhs=0.0;
		telikhTimhSyskeyhs=0.0;
		
	}
	//Domhths pliris//
	public syskeyes(int arithmosSyskeyhs,double arxikhTimhSyskeyhs,double telikhTimhSyskeyhs){
		this.arithmosSyskeyhs=arithmosSyskeyhs;
		this.arxikhTimhSyskeyhs=arxikhTimhSyskeyhs;
		this.telikhTimhSyskeyhs=telikhTimhSyskeyhs;
		
	}
	
	public static int getArithmosSyskeyhs(int arithmosSyskeyhs){
		return arithmosSyskeyhs=arithmosSyskeyhs;
	}
	public static double getArxikhTimhSyskeyhs(double arxikhTimhSyskeyhs){
		return arxikhTimhSyskeyhs=arxikhTimhSyskeyhs;
	}
	public static void getTelikhTimhSyskeyhs(double syntelestis,double telikhTimhSyskeyhs){
		double ektosi=(syntelestis/100)*telikhTimhSyskeyhs;
		double telikhTimhSyskeys=telikhTimhSyskeyhs*ektosi;
	}
}
