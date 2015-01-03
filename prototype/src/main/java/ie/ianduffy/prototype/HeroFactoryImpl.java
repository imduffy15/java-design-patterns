package ie.ianduffy.prototype;

public class HeroFactoryImpl implements HeroFactory {

	private final Beast beast;

	private final Mage mage;

	private final Warlord warlord;

	public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
		this.mage = mage;
		this.warlord = warlord;
		this.beast = beast;
	}

	@Override
	public Beast createBeast() {
		try {
			return beast.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public Mage createMage() {
		try {
			return mage.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public Warlord createWarlord() {
		try {
			return warlord.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
