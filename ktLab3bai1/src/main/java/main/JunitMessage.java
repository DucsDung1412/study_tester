package main;

public class JunitMessage {
	
	private String s = "";
	
	public JunitMessage(String s) {
		this.s = s;
	}
	
	public void printMessage() {
		System.out.println(s);
		int divide = 1/0;
	}
	
	public String printHiMessage() {
		s = "Hi " + s;
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		
	}
}
