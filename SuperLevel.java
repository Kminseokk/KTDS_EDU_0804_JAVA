package java0804;

public class SuperLevel extends PlayerLevel {
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	
	public void jump(int count) {
		for(int i = 0; i < count; i++)
			System.out.println("Jump!");
	}
	
	public void turn() {
		System.out.println("Super Turn!");
	}
	
	public void showLevelMessage() {
		System.out.println("***** 슈퍼 레벨 입니다. *****");
	}

}
