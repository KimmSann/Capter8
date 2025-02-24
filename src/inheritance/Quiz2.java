package inheritance;

public class Quiz2 {

	public static void main(String[] args) {
		BasicTv basicTv = new BasicTv();
		basicTv.turn = "on";
		basicTv.chnal = 7;
		basicTv.volum = 20;
		basicTv.showInfo();
		
		
		SmartTv smartTv = new SmartTv();
		smartTv.turn = "on";
		smartTv.chnal = 11;
		smartTv.volum = 30;
		smartTv.IP = "192.168.0.111";
		smartTv.showInfo();

	}

}

class BasicTv{
	String turn;
	int chnal;
	int volum;
	
	public void showInfo() {
		
		System.out.println("-------------");
		System.out.println("현재 전원 상태" + turn);
		System.out.println("현재 채널 " + chnal);
		System.out.println("현재 tv 볼륨 : " + volum);
	}
}

class SmartTv extends BasicTv{
	String IP;
	
	public void showInfo() {
	System.out.println("-------------");
	System.out.println("현재 전원 상태" + turn);
	System.out.println("현재 채널 " + chnal);
	System.out.println("현재 tv 볼륨 : " + volum);
	System.out.println("tv IP 주소" + IP);
	
	}
}
