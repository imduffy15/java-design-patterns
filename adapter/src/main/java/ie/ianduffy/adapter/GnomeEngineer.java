package ie.ianduffy.adapter;

public class GnomeEngineer implements Engineer {

	private GoblinGilder glider;

	public GnomeEngineer() {
		glider = new GoblinGilder();
	}

	@Override
	public void operateDevice() {
		glider.attachGlider();
		glider.gainSpeed();
		glider.takeOff();
	}

}
