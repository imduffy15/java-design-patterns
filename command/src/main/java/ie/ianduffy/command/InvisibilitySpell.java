package ie.ianduffy.command;

public class InvisibilitySpell extends Command {

	private Target target;

	@Override
	public void execute(Target target) {
		target.setVisibility(Visibility.INVISIBLE);
		this.target = target;
	}

	@Override
	public String toString() {
		return "Invisibility spell";
	}

	@Override
	public void undo() {
		if (target != null) {
			target.setVisibility(Visibility.VISIBLE);
		}
	}
}
