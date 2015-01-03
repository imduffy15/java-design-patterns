package ie.ianduffy.command;

public enum Visibility {

	VISIBLE, INVISIBLE;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}

}
