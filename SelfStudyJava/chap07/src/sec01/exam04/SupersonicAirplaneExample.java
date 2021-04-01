package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane SA = new SupersonicAirplane();
		SA.takeOff();
		SA.fly();
		SA.flyMode = SupersonicAirplane.SUPERSONIC;
		SA.fly();
		SA.flyMode = SupersonicAirplane.NORMAL;
		SA.fly();
		SA.land();
	}
}
