package ie.ianduffy.command;

public enum Size {

	SMALL, NORMAL;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}

}
