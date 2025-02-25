package downcasting;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Student("K"));
		list.add(new Employee("P"));
		
		for (Person person : list) {
			if(person instanceof Student) {
				Student student = (Student) person;
				student.study();
			} else if(person instanceof Employee) {
				Employee employee = (Employee) person;
				employee.work();
			}
		}

	}

}
class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "가 밥을 먹는다");
	}
}

class Student extends Person {

	// 상속받으면 에러남. 이름을 초기화하는 생성자를 만들어야함
	public Student(String name) {
		super(name);
	}

	public void study() {
		System.out.println(name + " 학생이 공부를 한다");
	}
}

class Employee extends Person {

	public Employee(String name) {
		super(name);
	}

	public void work() {
		System.out.println(name + " 회사원이 일을 한다");
	}
}