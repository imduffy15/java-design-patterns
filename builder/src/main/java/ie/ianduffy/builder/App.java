package ie.ianduffy.builder;

public class App {

	public static void main(String[] args) {
		Hero warrior = new Hero.HeroBuilder(Profession.WARRIOR, "Richard")
				.withHairColor(HairColor.BLACK)
				.withHairType(HairType.CURLY)
				.withArmor(Armor.CHAIN_MAIL)
				.withWeapon(Weapon.SWORD)
				.build();
		System.out.println(warrior);

		Hero mistress = new Hero.HeroBuilder(Profession.HOUSE_WIFE, "Tara")
				.withHairColor(HairColor.BLONDE)
				.withHairType(HairType.STRAIGHT)
				.build();
		System.out.println(mistress);
	}
}
