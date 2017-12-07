package BasicOfJava;

public class StaticAndNonStaticInJava {
	
	int i;
	int j;
	
	static int p;
	static int k;
	
	public void test1(){
		System.out.println("test 1 non static");
	}
	
	public static void test2(){
		System.out.println("test 2 static");
	}
	
	public void test3(){
		System.out.println("test 1 non static");
	}
	
	public static void test4(){
		System.out.println("test 4 static");
	}
	
	public static void main(String[] args) {
		/*
		* if you use static you have to use the class name to call the method
		* if you use non static method you have to create to object of the class to call the non static method
		* */
		
		StaticAndNonStaticInJava obj = new StaticAndNonStaticInJava();
		obj.test1();
		obj.test3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		StaticAndNonStaticInJava.test2();
		StaticAndNonStaticInJava.test4();
		System.out.println(StaticAndNonStaticInJava.k);
		System.out.println(StaticAndNonStaticInJava.p);
	}

}
