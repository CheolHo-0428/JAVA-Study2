package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	public void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번으로 변경되었습니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
