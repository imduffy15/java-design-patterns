package ie.ianduffy.singleton;

public class IvoryTower {

	private static IvoryTower instance = new IvoryTower();

	private IvoryTower() {
	}

	public static IvoryTower getInstance() {
		return instance;
	}
}
