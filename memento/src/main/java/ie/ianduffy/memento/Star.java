package ie.ianduffy.memento;

public class Star {

	private StarType starType;
	private int ageYears;
	private int massTons;

	public Star(StarType starType, int startAge, int startMass) {
		this.starType = starType;
		this.ageYears = startAge;
		this.massTons = startMass;
	}

	public void timePasses() {
		ageYears *= 2;
		massTons *= 8;
		switch (starType) {
			case RED_GIANT:
				starType = StarType.WHITE_DWARF;
				break;
			case SUN:
				starType = StarType.RED_GIANT;
				break;
			case SUPERNOVA:
				starType = StarType.DEAD;
				break;
			case WHITE_DWARF:
				starType = StarType.SUPERNOVA;
				break;
			case DEAD:
				ageYears *= 2;
				massTons = 0;
				break;
			default:
				break;
		}
	}

	StarMemento getMemento() {
		StarMementoInternal state = new StarMementoInternal();
		state.setAgeYears(ageYears);
		state.setMassTons(massTons);
		state.setStarType(starType);
		return state;
	}

	void setMemento(StarMemento memento) {

		StarMementoInternal state = (StarMementoInternal) memento;
		this.starType = state.getStarType();
		this.ageYears = state.getAgeYears();
		this.massTons = state.getMassTons();

	}

	@Override
	public String toString() {
		return String.format("%s age: %d years mass: %d tons", starType, ageYears, massTons);
	}

}
