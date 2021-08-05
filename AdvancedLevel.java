package java0804;

public class AdvancedLevel extends PlayerLevel  {
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	
	public void jump(int count) {
		for(int i = 0; i < count; i++)
			System.out.println("Jump!");
	}
	
	public void turn() {
		System.out.println("Turn 할 줄 모르지롱.");
	}
	
	public void showLevelMessage() {
		System.out.println("***** 어드밴스드 레벨 입니다. *****");
	}
}
