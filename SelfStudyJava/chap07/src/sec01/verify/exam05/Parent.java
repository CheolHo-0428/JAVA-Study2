package sec01.verify.exam05;

public class Parent {
	public String nation;
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent call");
	}
	
	public Parent() {
		nation = "대한민국";
		System.out.println("Parent(String nation) call");
	}	
}
