package ie.ianduffy.factorymethod;

/**
 * Created by duffy on 03/01/2015.
 */
public enum WeaponType {
	AXE, SHORT_SWORD, SPEAR;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
