package ie.ianduffy.Facade;

abstract class DwarvenMineWorker {

	public void goHome() {
		System.out.println(name() + " goes home");
	}

	public void goToMine() {
		System.out.println(name() + " goes to mine");
	}

	public void goToSleep() {
		System.out.println(name() + " goes to sleep");
	}

	protected abstract String name();

	public void wakeUp() {
		System.out.println(name() + " wakes up");
	}

	public abstract void work();
}
