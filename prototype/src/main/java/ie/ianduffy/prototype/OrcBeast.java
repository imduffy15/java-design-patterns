package ie.ianduffy.prototype;

class OrcBeast extends Beast {

	public OrcBeast() {
	}

	private OrcBeast(OrcBeast beast) {
	}

	@Override
	public Beast clone() throws CloneNotSupportedException {
		return new OrcBeast(this);
	}

	@Override
	public String toString() {
		return "Orcish beast";
	}
}
