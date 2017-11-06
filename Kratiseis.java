
public class Kratiseis {

	public static double YpologismosKratiseon(double akatharistos,int kratiseis){
		double katharos;
		
		switch(kratiseis){
		case 20:
			katharos=akatharistos-(akatharistos*0.20);
			break;
		case 25:
			katharos=akatharistos-(akatharistos*0.25);
			break;
		case 30:
			katharos=akatharistos-(akatharistos*0.30);
			break;
		default:
			katharos=akatharistos-(akatharistos*0.45);
			break;
		}
	return (katharos);
		
		}
	}

