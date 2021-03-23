package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		String str = "10";
		String str1 = "true";
		int value1 = Integer.parseInt(str);
		double value2 = Double.parseDouble(str);
		boolean value3 = Boolean.parseBoolean(str1);
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str2 = String.valueOf(10);
		String str3 = String.valueOf(3.14);
		String str4 = String.valueOf(true);
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var = (double)intValue;
		byte var1 = (byte)intValue;
		int var2 = (int)doubleValue;
		//char var3 = (char)strValue; // 컴파일 에러
	}

}
