package ie.ianduffy.factorymethod;

public enum WeaponType {
	AXE, SHORT_SWORD, SPEAR;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
