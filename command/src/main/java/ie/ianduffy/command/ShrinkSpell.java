package ie.ianduffy.command;

public class ShrinkSpell extends Command {

	private Size oldSize;

	private Target target;

	public ShrinkSpell() {
		target = null;
	}

	@Override
	public void execute(Target target) {
		oldSize = target.getSize();
		target.setSize(Size.SMALL);
		this.target = target;
	}

	@Override
	public String toString() {
		return "Shrink spell";
	}

	@Override
	public void undo() {
		if (oldSize != null && target != null) {
			target.setSize(oldSize);
		}
	}
}
