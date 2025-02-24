package inheritance;

public class Monsters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Monster{
	int attack;
	int health;
	
	public void doAttack() {
		System.out.println("몬스터가 " +  attack + "만큼 공격했다!");
	}
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + attack + "이고 체력은" + health + "이다." );
	}
}
class Slime extends Monster{
	String skill;
	
	
	public void doSkill() {
		System.out.println("슬라임이  " + skill + "을 사용했다.");
	}
}