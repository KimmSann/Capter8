package inheritance;

public class Quiz3 {

	public static void main(String[] args) {
	Pen pen = new Pen();
	pen.penWeight = 3;
	pen.amount = 70;
	pen.showInfo();
	
	
	BallPen ballPen = new BallPen();
	ballPen.ballPenColor = "Blue";
	ballPen.showInfo();
	
	ManPen manPen = new ManPen();
	manPen.penbrand = "JetStrame";
	manPen.showInfo();
	}
	
}

class Pen{
	int penWeight;
	int amount;
	
	public void showInfo() {
		System.out.println("펜의 굵이 :" + penWeight);
		System.out.println("남은 양 :" + amount);
	}
	
}
class BallPen extends Pen{
	String ballPenColor;
	
	public void showInfo() {
		System.out.println("펜의 색 : " + ballPenColor);
	}
	
}
class ManPen extends Pen{
	String penbrand;
	
	public void showInfo() {
		System.out.println("브랜드 : "  + penbrand);
	}
}