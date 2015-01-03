package ie.ianduffy.singleton;

public class ThreadSafeLazyLoadedIvoryTower {
	private static ThreadSafeLazyLoadedIvoryTower instance = null;

	private ThreadSafeLazyLoadedIvoryTower() {
	}

	public synchronized static ThreadSafeLazyLoadedIvoryTower getInstance() {
		if(instance == null) instance = new ThreadSafeLazyLoadedIvoryTower();
		return instance;
	}
}
