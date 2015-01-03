package ie.ianduffy.Facade;

public class DwarnvenCartOperator extends DwarvenMineWorker {

	@Override
	protected String name() {
		return "Dwarnven cart operator";
	}

	@Override
	public void work() {
		System.out.println(name() + " moves gold chunks out of mine");
	}
}
