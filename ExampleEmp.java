
public class ExampleEmp {

	/**
	 * @param args
	 */
	public String name;
	private double salary;
	public ExampleEmp(String empName){
		name=empName;
	}
	public void setSalary(double empSal){
		salary=empSal;
	}
	public void printEmp(){
		

		System.out.println ("name:   "+name);
		System.out.println("Salary:  "+salary);
	}
	public static void main (String args[]){
		ExampleEmp emp1=new ExampleEmp ("ANNA");
		emp1.setSalary(1000);
		emp1.printEmp();
	}
}
