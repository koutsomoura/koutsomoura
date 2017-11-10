
public class askisi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="Nikiforos polo";
		String name2="Antouaneta";
	
		System.out.println(name1.length());
		char b=name1.charAt(7);
		System.out.println(b);
		boolean D=name1.equals(name2);
		System.out.println(D);
		
		String allname=name1.concat(name2);
		System.out.println(allname);
		
		String mikra=allname.toLowerCase();
		System.out.println(mikra);
		
		int sulabi=name1.indexOf("fo");
		System.out.println(sulabi);
		
		int frasi=name1.indexOf('o',9);
		System.out.println(frasi);
		
		String pet="Cat,mouse,dog";
		String kind="mouse";
		int x=pet.indexOf(kind);
		System.out.println(x);
		
		int y=name1.lastIndexOf('i');
		System.out.println(y);
		
		int f=name1.lastIndexOf('o',8);
		System.out.println(f);
		
		boolean a=name1.startsWith("Nik");
		System.out.println(a);
		boolean s=name2.endsWith("ete");
		System.out.println(s);
		
		String h=name1.substring(4);
		System.out.println(h);
		
		StringBuffer buff1= new StringBuffer("ONOMA:");
		buff1.append("ANTONI");
		System.out.println(buff1);
		
		String j=name1.substring(4,11);
		System.out.println(j);
		
		String k="Anoigo tin porta";
		String k1="eredANoigo tin ejoporta";
		boolean k2=k.regionMatches(1,k1,5,5);
		System.out.println(k2+"------------");
		
		String q=name1.replace('o', 'w');
		System.out.println(q);
		
		String e="    ada adw fre   as e    ";
		String t=e.trim();
		System.out.println(t);
		
		int m= name1.compareTo(name2);
		System.out.println(m);
	
		StringBuffer l=new StringBuffer("1234534");
		l.append("42453");
		System.out.println(l);
		
		l.insert(3, buff1);
		System.out.println(l);
		l.delete(4, 10);
		System.out.println(l);
		String popo="123456789123";
		l.replace(4, 9, popo);
		System.out.println(l);
		
		int re=l.capacity();
		System.out.println(re);
		int u=popo.length();
		System.out.println(u);
		
		l.reverse();
		System.out.println(l);
	}

}
