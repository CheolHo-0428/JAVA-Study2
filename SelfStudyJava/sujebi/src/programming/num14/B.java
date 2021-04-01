package programming.num14;

class B extends A{
	private String s;
	
	B(String s){
		super(s);
		this.s = s + "B";
	}
	
	public void fn(String s) {
		System.out.println(this.s + s + s);
	}
}

