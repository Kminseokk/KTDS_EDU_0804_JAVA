package java0804;

public class AdvancedLevel extends PlayerLevel  {
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	
	public void jump(int count) {
		for(int i = 0; i < count; i++)
			System.out.println("Jump!");
	}
	
	public void turn() {
		System.out.println("Turn �� �� ������.");
	}
	
	public void showLevelMessage() {
		System.out.println("***** ���꽺�� ���� �Դϴ�. *****");
	}
}
