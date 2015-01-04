package ie.ianduffy.memento;

public enum StarType {
	RED_GIANT, WHITE_DWARF, SUPERNOVA, DEAD, SUN;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
