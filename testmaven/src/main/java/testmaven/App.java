package testmaven;

public class App {
	public boolean isEventNumber(int input) {
		if(input % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		App c = new App();
		System.out.println(c.isEventNumber(3));
	}
}