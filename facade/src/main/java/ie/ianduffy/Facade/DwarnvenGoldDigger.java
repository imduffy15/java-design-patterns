package ie.ianduffy.Facade;

public class DwarnvenGoldDigger extends DwarvenMineWorker {

	@Override
	protected String name() {
		return "Dwarven gold digger";
	}

	@Override
	public void work() {
		System.out.println(name() + " digs for gold");
	}
}
