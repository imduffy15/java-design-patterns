package ie.ianduffy.factorymethod;

public class OrcBlackSmith implements Blacksmith {

	private WeaponType weaponType;

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

	@Override
	public String toString() {
		return "Orc " + weaponType;
	}
}
