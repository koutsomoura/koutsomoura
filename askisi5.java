
class askisi5<T>{
	
	private T t;

	public void add(T t) {this.t= t;}
	
	public T get() {return t;}
	
	public static void main(String[] args) {
			
		askisi5<Integer> i1 = new askisi5<Integer>();
		askisi5<String> s1 = new askisi5<String>();
		
		i1.add(new Integer(25));
		s1.add(new String("Hello Generic Class"));
		
		System.out.println("Arithmos = " + i1.get());
		System.out.println("To string = " + s1.get());
		
		
	}

}
