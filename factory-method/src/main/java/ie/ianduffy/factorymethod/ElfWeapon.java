package ie.ianduffy.factorymethod;

class ElfWeapon implements Weapon {

	private final WeaponType weaponType;

	public ElfWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Elven " + weaponType;
	}
}
