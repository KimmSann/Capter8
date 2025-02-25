package polymorphism;

public class Quiz1 {
	public static void main(String[] args) {
		runCar(new Bus());
		runCar(new SportCar());
		
	}
	public static void runCar(Car car) {
		car.run();
	}
	public static void runCar(Bus bus) {
		bus.run();
	}
	public static void runCar(SportCar sportCar) {
		sportCar.run();
	}

}
class Car{
	public void run() {
		System.out.println("자동차가 달린다.");
	}
}
class Bus extends Car{
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class SportCar extends Car{
	@Override
	public void run() {
		System.out.println("스포츠카가 달린다.");
	}
}
