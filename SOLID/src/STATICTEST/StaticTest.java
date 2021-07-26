package STATICTEST;

public class StaticTest {
	 int i = 10;
	static int j = 20;
	
	public void test() {
		System.out.println(i);
		test2();
	}
	public static void test2() {
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		System.out.println(j);
		StaticTest abc = new StaticTest();
		abc.test();
	}


}
