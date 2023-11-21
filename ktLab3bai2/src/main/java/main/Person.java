package main;

public class Person {
	
	private String name = "";
	private int age = 0;
	
	public Person(String s, int i) {
		this.name = s;
		this.age = i;
		if(i < 0) {
			throw new IllegalArgumentException("Invalid age: " + i);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
