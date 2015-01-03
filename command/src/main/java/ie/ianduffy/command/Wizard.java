package ie.ianduffy.command;

public class Wizard extends Target {

	private Command previousSpell;

	public Wizard() {
		this.setSize(Size.NORMAL);
		this.setVisibility(Visibility.VISIBLE);
		previousSpell = null;
	}

	public void castSpell(Command command, Target target) {
		System.out.println(this + " casts " + command + " at " + target);
		command.execute(target);
		previousSpell = command;
	}

	@Override
	public String toString() {
		return "Wizard";
	}

	public void undoLastSpell() {
		if (previousSpell != null) {
			System.out.println(this + " undoes " + previousSpell);
			previousSpell.undo();
		}
	}

}
