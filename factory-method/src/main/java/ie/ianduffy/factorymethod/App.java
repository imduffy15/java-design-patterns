package ie.ianduffy.factorymethod;

public class App {
	public static void main(String[] args) {
		Blacksmith blacksmith;

		blacksmith = new OrcBlackSmith();
		System.out.println(blacksmith.manufactureWeapon(WeaponType.SPEAR));
		System.out.println(blacksmith.manufactureWeapon(WeaponType.AXE));

		blacksmith = new ElfBlackSmith();
		System.out.println(blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD));
		System.out.println(blacksmith.manufactureWeapon(WeaponType.SPEAR));
	}
}
