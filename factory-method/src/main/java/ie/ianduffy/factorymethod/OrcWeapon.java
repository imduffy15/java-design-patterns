package ie.ianduffy.factorymethod;

class OrcWeapon implements Weapon {

	private final WeaponType weaponType;

	public OrcWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Orcish " + weaponType;
	}

}
