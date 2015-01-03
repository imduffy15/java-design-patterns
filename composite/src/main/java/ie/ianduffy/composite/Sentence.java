package ie.ianduffy.composite;

import java.util.List;

class Sentence extends LetterComposite {

	public Sentence(List<Word> words) {
		for (Word word : words) {
			this.add(word);
		}
	}

	@Override
	public void printThisAfter() {
		System.out.println(".");
	}

	@Override
	public void printThisBefore() {

	}
}
