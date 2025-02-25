package override;

import java.util.ArrayList;


public class Ex4 {
	public static void main(String [] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
		Customer customer1 = new Customer("둘리");
		Customer customer2 = new Customer("k");
		Customer customer3 = new Customer("p");
		Customer customer4 = new VIPCustomer("c");
		Customer customer5 = new VIPCustomer("o");
		customerList.add(customer1); //리스트에 회원 추가
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		System.out.println("====== 회원등급에따라 할인율과 보너스 포인트 계산 =======");
		for (Customer customer : customerList) { //리스트의 요소를 꺼내서 부모타입 변수에 저장
			customer.calcPrice(10000); //실제 인스턴스에따라 재정의된 메소드 호출
		}
		
		for (Customer customer : customerList) {
			customer.showInfo(); //고객정보 출력
		}
	}

}
