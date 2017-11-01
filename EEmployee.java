
public class EEmployee {


		String firstname;
		String lastname;
		float salary;
		public EEmployee(String firstname,String lastname,float salary){
			firstname="";
			lastname="";
			salary=0.0f;
			
		}
		public void setfirstname(String n){
			firstname=n;
		}
		public String getFirstname(){
			return firstname;
		}
		public void setlastname(String n){
			lastname=n;
		}
		public String getlastname(){
			return lastname;
		}
		public void setsalary(float Euro){
			salary=Euro;
		}
		public float getsalary(){
			return salary;
		}
	}

