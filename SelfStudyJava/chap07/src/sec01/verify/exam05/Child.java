package sec01.verify.exam05;

public class Child extends Parent {
	private String name;
	
	public Child(String name) {
		super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	public Child() {
		super();
		name = "홍길동";
		System.out.println("Child() call");
	}
}
