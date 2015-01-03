package ie.ianduffy.prototype;

class ElfBeast extends Beast {

	public ElfBeast() {
	}

	private ElfBeast(ElfBeast beast) {
	}

	@Override
	public Beast clone() throws CloneNotSupportedException {
		return new ElfBeast(this);
	}

	@Override
	public String toString() {
		return "Elven beast";
	}
}
