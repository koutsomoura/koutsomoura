
public class askisi5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class GenericTest1<T>{
		private T t;
		public void add(T t) {this.t= t;}
		public T get() {
		return t;}
		public static void main(String[] args) {
			
			GenericTest1<Integer> i1 = new GenericTest1<Integer>();
			GenericTest1<String> s1 = new GenericTest1<String>();
			i1.add(new Integer(25));
			s1.add(new String("Hello Generic Class"));
			System.out.println("Arithmos = " + i1.get());
			System.out.println("To string = " + s1.get());
		}
		}
	}

}
