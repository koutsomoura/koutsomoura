
public class syskeyes {

	final String ypokatasthma="Ypokatasthma Thessalonikis";
	private int arithmosSyskeyhs;
	private int kodikosSyskeyhs;
	private double arxikhTimhSyskeyhs;
	private double telikhTimhSyskeyhs;
	
	//Domhths kenos//
	public syskeyes(){
		arithmosSyskeyhs=classofstaticmethods.trexonArithmosSyskeyhs++;
		arxikhTimhSyskeyhs=0.0;
		telikhTimhSyskeyhs=0.0;
		
	}
	//Domhths pliris//result
	public syskeyes(int arithmosSyskeyhs,double arxikhTimhSyskeyhs,double telikhTimhSyskeyhs){
		this.arithmosSyskeyhs=classofstaticmethods.trexonArithmosSyskeyhs++;
		this.arxikhTimhSyskeyhs=arxikhTimhSyskeyhs;
		this.telikhTimhSyskeyhs=telikhTimhSyskeyhs;
	}
	
	public void setArithmosSyskeyhs(int arithmosSyskeyhs){
		this.arithmosSyskeyhs=arithmosSyskeyhs;
	}
	public int getArithmosSyskeyhs(){
		return arithmosSyskeyhs;
	}
	public void setKodikosSyskeyhs(int kodikosSyskeyhs){
		this.kodikosSyskeyhs=kodikosSyskeyhs;
	}
	public int getKodikosSyskeuhs(){
		return kodikosSyskeyhs;
	}
	public void setArxikhTimhSyskeyhs(double arxikhTimhSyskeyhs){
		this.arxikhTimhSyskeyhs=arxikhTimhSyskeyhs;
	}
	public double getArxikhTimhSyskeyhs(){
		return arxikhTimhSyskeyhs;
	}
	public String getYpokatasthma(){
		return ypokatasthma;
	}
	public void setTelikhTimhSyskeyhs(double telikhTimhSyskeyhs){
		double sinolo=0.0;
		if (telikhTimhSyskeyhs<=100){
			double ektosi=(20.0/100.0)*telikhTimhSyskeyhs;
			sinolo=telikhTimhSyskeyhs-ektosi;
		}
		else if(telikhTimhSyskeyhs>=101&&telikhTimhSyskeyhs<=500){
			double ektosi=(30.0/100.0)*telikhTimhSyskeyhs;
			sinolo=telikhTimhSyskeyhs-ektosi;

		}
		else if (telikhTimhSyskeyhs>500){
			double ektosi=(50.0/100.0)*telikhTimhSyskeyhs;
			sinolo=telikhTimhSyskeyhs-ektosi;
		}
		this.telikhTimhSyskeyhs=sinolo;

	}
	public double getTelikhTimhSyskeuhs(){
		return telikhTimhSyskeyhs;
	}
	
	public String toString(){
		
		return String.format("%-10s %-10s %-10s",arithmosSyskeyhs,arxikhTimhSyskeyhs,telikhTimhSyskeyhs);
	}
}
