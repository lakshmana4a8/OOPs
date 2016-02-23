package questions;

public class Sysouts {
	static {
		System.out.println("executes without main method");
	}
	public static void main(String[] args) {
		Integer integer1 = new Integer(4);
		Integer integer2 = new Integer(5);
		Integer integer3 = new Integer(6);
		Sysouts sysouts = new Sysouts();
		System.out.println("**************************************************");
		System.out.println(sysouts.getClass().getCanonicalName());
		System.out.println(sysouts.getClass().getSimpleName());
		System.out.println(sysouts.getClass().getName());
		System.out.println("**************************************************");
		System.out.println(integer1.compareTo(integer2));
		System.out.println(integer3.compareTo(integer2));
	}
}
