package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Customer{
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	
	public Customer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
	}
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + price*bonusRatio;
		System.out.println(customerName + "님이" + price + "원을 결제 했습니다.");
		
	}
}