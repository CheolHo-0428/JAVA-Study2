package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone DCP = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델: " + DCP.model);
		System.out.println("색상: " + DCP.color);
		System.out.println("채널: " + DCP.channel);
		
		DCP.powerOn();
		DCP.bell();
		DCP.sendVoice("여보세요");
		DCP.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		DCP.sendVoice("반갑습니다.");
		DCP.powerOff();
		
		DCP.turnOnDmb();
		DCP.changeChannelDmb(12);
		DCP.turnOffDmb();
	}

}
