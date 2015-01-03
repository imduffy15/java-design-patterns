package ie.ianduffy.prototype;

class OrcMage extends Mage {

	public OrcMage() {
	}

	private OrcMage(OrcMage mage) {
	}

	@Override
	public Mage clone() throws CloneNotSupportedException {
		return new OrcMage(this);
	}

	@Override
	public String toString() {
		return "Orcish mage";
	}

}
