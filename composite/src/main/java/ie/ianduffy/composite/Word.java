package ie.ianduffy.composite;

import java.util.List;

class Word extends LetterComposite {

	public Word(List<Letter> letters) {
		for (Letter letter : letters) {
			this.add(letter);
		}

	}

	@Override
	void printThisAfter() {

	}

	@Override
	void printThisBefore() {
		System.out.print(" ");
	}
}
