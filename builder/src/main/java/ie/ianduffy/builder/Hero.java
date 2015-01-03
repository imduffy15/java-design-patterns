package ie.ianduffy.builder;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class Hero {

	private final Profession profession;
	private final String name;
	private final HairType hairType;
	private final HairColor hairColor;
	private final Armor armor;
	private final Weapon weapon;

	private Hero(HeroBuilder builder) {
		this.profession = builder.profession;
		this.name = builder.name;
		this.hairType = builder.hairType;
		this.hairColor = builder.hairColor;
		this.armor = builder.armor;
		this.weapon = builder.weapon;
	}

	public static class HeroBuilder {
		private final Profession profession;
		private final String name;
		private HairType hairType;
		private HairColor hairColor;
		private Armor armor;
		private Weapon weapon;

		public HeroBuilder(Profession profession, String name) {
			if(profession == null) {
				throw new NullPointerException("profession cannot be null");
			}
			if(name == null) {
				throw new NullPointerException("name cannot be null");
			}
			this.profession = profession;
			this.name = name;
		}

		public HeroBuilder withHairType(HairType hairType) {
			this.hairType = hairType;
			return this;
		}

		public HeroBuilder withHairColor(HairColor hairColor) {
			this.hairColor = hairColor;
			return this;
		}

		public HeroBuilder withArmor(Armor armor) {
			this.armor = armor;
			return this;
		}

		public HeroBuilder withWeapon(Weapon weapon) {
			this.weapon = weapon;
			return this;
		}

		public Hero build() {
			return new Hero(this);
		}
	}
}
