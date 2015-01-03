package ie.ianduffy.singleton;

public class IvoryTower {

	private static final IvoryTower instance = new IvoryTower();

	private IvoryTower() {
	}

	public static IvoryTower getInstance() {
		return instance;
	}
}
