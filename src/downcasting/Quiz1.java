package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		// Animal 타입의 리스트를 생성하면, 사람 호랑이 독수리 저장 가능
		ArrayList<Animal> aniList = new ArrayList<Animal>();

		aniList.add(new Human()); // 리스트에 사람 추가
		aniList.add(new Tiger()); // 리스트에 호랑이 추가
		aniList.add(new Eagle()); // 리스트에 독수리 추가

		// for문으로 리스트의 요소를 하나씩 꺼냄
		for (int i = 0; i < aniList.size(); i++) {

			Animal ani = aniList.get(i); //요소를 꺼내서 Animal형 변수에 저장

			if (ani instanceof Human) { // 인스턴스의 타입이 Human형이면
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) { // 인스턴스의 타입이 Tiger형이면
				Tiger t = (Tiger) ani; // Tiger형으로 다운캐스팅
				t.hunting();
			} else if (ani instanceof Eagle) { // 인스턴스의 타입이 Eagle형이면
				Eagle e = (Eagle) ani; // Eagle형으로 다운캐스팅
				e.flying();
			}
		}
	}

}