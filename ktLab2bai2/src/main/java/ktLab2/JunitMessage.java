package ktLab2;

public class JunitMessage {
	private String s = "";
	
	public JunitMessage(String s) {
		this.s = s;
	}
	
	public String printMessage() {
		throw new ArithmeticException();
	}
	
	public String printHiMessage() {
		return "Hi " + s;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
