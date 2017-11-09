
public class EmplM {

	String name;
	int meresergasia;
	double hmeromosthio;
	double yperories;


EmplM(String name,int meresergasia,double hmeromosthio,double yperories){
this.name=name;
this.meresergasia=meresergasia;
this.hmeromosthio=hmeromosthio;
this.yperories=yperories;
}
public static double[] methodAKM(EmplM a[]){
	double AKM[]=new double[4];
	for(int i=0;i<4;i++){
	AKM[i]=a[i].meresergasia*a[i].hmeromosthio+0.2*a[i].hmeromosthio*a[i].yperories;}
	return AKM;
}
public String toString(){
	return String.format("%-10s %-10s %-10s %-10s",name,meresergasia,hmeromosthio,yperories);
}
}
