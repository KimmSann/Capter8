package inheritance;

public class Quiz4 {

	public static void main(String[] args) {
		Slime slime = new Slime();
		slime.attack = 30;
		slime.health = 200;
		slime.skill = "마비";
		
		slime.showInfo();
		slime.doAttack();
		slime.doSkill();

	}

}

