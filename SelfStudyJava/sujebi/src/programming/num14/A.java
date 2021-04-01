package programming.num14;

public class A {
	private String s;
	
	A(String s){
		this.s = s + "A";
	}
	
	public void fn(String s) {
		System.out.println(this.s + s);
	}
}