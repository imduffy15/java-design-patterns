package ie.ianduffy.Facade;

public class DwarnvenTunnelDigger extends DwarvenMineWorker {

	@Override
	protected String name() {
		return "Dwarven tunnel digger";
	}

	@Override
	public void work() {
		System.out.println(name() + " creates another promising tunnel.");
	}
}
