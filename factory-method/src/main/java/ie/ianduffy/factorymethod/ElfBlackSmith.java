package ie.ianduffy.factorymethod;

public class ElfBlackSmith implements Blacksmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}
}
