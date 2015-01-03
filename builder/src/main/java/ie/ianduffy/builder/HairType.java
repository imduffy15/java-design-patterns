package ie.ianduffy.builder;

public enum HairType {
	CURLY, STRAIGHT;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
