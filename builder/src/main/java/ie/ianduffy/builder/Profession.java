package ie.ianduffy.builder;

public enum Profession {
	WARRIOR, HOUSE_WIFE;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
