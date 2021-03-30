package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5);
		System.out.println((float)v4==v5);
		
		String strVar1 = "신용권";
		String strVar2 = "신용권";
		System.out.println(strVar1.equals(strVar2));
		System.out.println(!strVar1.equals(strVar2));

	}

}
