package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A(1,1,1);
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; 컴파일 에러
		
		a.method1();
		a.method2();
		//a.method3(); 컴파일 에러
	}
}
