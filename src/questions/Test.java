package questions;
import static java.lang.Math.*;


public class Test {
	public static int COUNT = 0;
	static float f;
	int coun = 10;
	public static void main(String[] args) {
		System.out.println(f);
		Test test = null;
		Test test1 = new Test();
		System.out.println(test == (null));
		System.out.println(test1.equals(null));
		System.out.println(pow(2,4));
		System.out.println("static count :"+test.COUNT);
		System.out.println(test.coun);
	}
	public Test() {
		COUNT++;
	}
}