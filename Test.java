
public class Test {

		double akm;
		int sintelestis;
		
		public static double Methodkm(double akm,int sintelestis){
			double km;
			switch(sintelestis){
			case 20:
				km=akm*0.8;
				break;
			
			case 25:
				km=akm*0.75;
				break;
			case 30:
				km=akm*0.70;
				break;
			default:
				km=akm*0.55;
				break;
			}	
		return km;
		}
	}
	


