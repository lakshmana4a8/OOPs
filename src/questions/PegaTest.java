package questions;

public class PegaTest {
	
	Integer i;
	int x;
	
	public void printVal(int y){
		x = i + y;
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		System.out.println(0.0/0);
		System.out.println(1/0.0);
		System.out.println(-1/0.0);
		PegaTest pegaTest = new PegaTest();
		System.out.println(pegaTest);
		
		float f = (1/4) * 10;
		System.out.println(f);
		int x = Math.round(f);
		System.out.println(x);
		pegaTest.printVal(new Integer(4));
	}


	@Override
	public String toString() {
		return "PegaTest [i=" + i + ", x=" + x + "]";
	}
}
