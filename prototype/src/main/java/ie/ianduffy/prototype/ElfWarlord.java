package ie.ianduffy.prototype;

class ElfWarlord extends Warlord {

	public ElfWarlord() {
	}

	private ElfWarlord(ElfWarlord warlord) {
	}

	@Override
	public Warlord clone() throws CloneNotSupportedException {
		return new ElfWarlord(this);
	}

	@Override
	public String toString() {
		return "Elven warlord";
	}

}
