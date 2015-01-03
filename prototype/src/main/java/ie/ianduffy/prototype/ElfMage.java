package ie.ianduffy.prototype;

class ElfMage extends Mage {

	public ElfMage() {
	}

	private ElfMage(ElfMage mage) {
	}

	@Override
	public Mage clone() throws CloneNotSupportedException {
		return new ElfMage(this);
	}

	@Override
	public String toString() {
		return "Elven mage";
	}

}
