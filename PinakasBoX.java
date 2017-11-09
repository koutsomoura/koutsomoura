
public class PinakasBoX {
	double w;
	double h;
	double d;
	
PinakasBoX(double w,double h,double d){
		this.w=w;
		this.h=h;
		this.d=d;
	}
	public static double[] volume(PinakasBoX[]a){
		double Vol[]= new double[3];
		for (int i=0;i<3;i++) Vol[i]=a[i].w*a[i].h*a[i].d;
		return Vol;
		
	}
	}
