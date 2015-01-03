package ie.ianduffy.builder;

public enum Armor {
	CHAIN_MAIL;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
