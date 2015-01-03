package ie.ianduffy.builder;

public enum Weapon {
	SWORD;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
