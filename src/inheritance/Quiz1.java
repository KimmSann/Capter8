package inheritance;

public class Quiz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.reg = 4;
		tiger.tail = 1;
		
		Eagle eagle = new Eagle();
		eagle.reg = 2;
		eagle.wing = 2;
		

	}

}

class Animal {
	int reg;
	
}

class Tiger extends Animal{
	int tail;
}
class Eagle extends Animal{
	int wing;
}