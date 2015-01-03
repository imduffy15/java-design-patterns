package ie.ianduffy.adapter;

public class GnomeEngineeringManager implements Engineer {

	private Engineer engineer;

	public GnomeEngineeringManager() {
		engineer = new GnomeEngineer();
	}

	@Override
	public void operateDevice() {
		engineer.operateDevice();
	}
}
