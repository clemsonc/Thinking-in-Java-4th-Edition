package Chapter3;

public class Exercise1 {	
	private static void cprint(String string) {
		System.out.println(string);		
	} 
	public static void main(String[] args) {
		Integer value = 100;
		cprint(value + " is an integer value, using the short way to print.");
		System.out.println(value + " is an integer value, using System.out to print.");
	}
}