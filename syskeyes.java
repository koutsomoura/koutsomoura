
public class syskeyes {

	final String ypokatasthma="Ypokatasthma Thessalonikis";
	private int arithmosSyskeyhs;
	private int kodikosSyskeyhs;
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
	public String getYpokatasthma(String ypokatasthma){
		ypokatasthma=ypokatasthma;
		return ypokatasthma;
	}
	public void setTelikhTimhSyskeyhs(double telikhTimhSyskeyhs){
		this.telikhTimhSyskeyhs=telikhTimhSyskeyhs;
		double sinolo=0;
		if (telikhTimhSyskeyhs<=100){
			double ektosi=(20/100)*telikhTimhSyskeyhs;
			sinolo=telikhTimhSyskeyhs*ektosi;
		}
		else if(telikhTimhSyskeyhs>=101&&telikhTimhSyskeyhs<=500){
			double ektosi=(30/100)*telikhTimhSyskeyhs;
			sinolo=telikhTimhSyskeyhs*ektosi;
		}
		else if (telikhTimhSyskeyhs>500){
			double ektosi=(50/100)*telikhTimhSyskeyhs;
			sinolo=telikhTimhSyskeyhs*ektosi;
		}
		telikhTimhSyskeyhs=sinolo;
	}
	public double getTelikhTimhSyskeuhs(){
		return telikhTimhSyskeyhs;
	}
}
