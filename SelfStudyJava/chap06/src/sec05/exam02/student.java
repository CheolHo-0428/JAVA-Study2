package sec05.exam02;

public class student {
	
	public int Num;
	public static int staticNum;
	
	public void Add(int num) {
		Num+=num;
		staticNum+=num;
		
		System.out.println("Num : " + Num);
		System.out.println("staticNum : " + staticNum);
	}
}