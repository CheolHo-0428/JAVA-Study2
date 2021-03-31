package sec03.exam04;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	Car(String model){
		this(model, "검정", 200);
	}
	
	Car(String model, String color){
		this(model, color, 200);
	}
}
