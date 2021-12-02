package static123;

public class Static1 {
	
	static int a=99;
	 int b=78;
	 
	 Static1(){
		 b=87;
	 }
	 
	 Static1(int c)
	 {
		 b=76;
	 }
	 
	 Static1(char h)
	 {
		 b=96;
	 }
	
	public static void main(String[] args) {
	
		System.out.println(a);
		Static1 y = new Static1();
		System.out.println(y.b);
	    Static1 k = new Static1(766);
	    System.out.println(k.b);
	    System.out.println(y.b);
	    Static1 d = new Static1('m');
	    System.out.println(d.b);
	    
	    
	}

}
