package ie.ianduffy.builder;

public enum HairColor {
	BLACK, BLONDE;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
