package ie.ianduffy.composite;

class Letter extends LetterComposite {

	private final char character;

	public Letter(char character) {
		this.character = character;
	}

	@Override
	public void printThisAfter() {
	}

	@Override
	public void printThisBefore() {
		System.out.print(character);
	}
}
