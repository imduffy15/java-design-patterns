package ie.ianduffy.adapter;

public class GnomeEngineeringManager implements Engineer {

	private final Engineer engineer;

	public GnomeEngineeringManager() {
		engineer = new GnomeEngineer();
	}

	@Override
	public void operateDevice() {
		engineer.operateDevice();
	}
}
