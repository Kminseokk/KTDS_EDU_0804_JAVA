package java0804;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump(int count);
	public abstract void turn();
	public abstract void showLevelMessage();
	
	int count;
	
	final public void go(int count) {
		run();
		jump(count);
		turn();
	}
}
