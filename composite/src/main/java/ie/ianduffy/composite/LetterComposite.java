package ie.ianduffy.composite;

import java.util.ArrayList;
import java.util.List;

abstract class LetterComposite {

	private final List<LetterComposite> children = new ArrayList<>();

	void add(LetterComposite letterComposite) {
		children.add(letterComposite);
	}

	void print() {
		printThisBefore();
		for (LetterComposite letter : children) {
			letter.print();
		}
		printThisAfter();
	}

	abstract void printThisAfter();

	abstract void printThisBefore();
}
