package ie.ianduffy.command;

abstract class Command {

	public abstract void execute(Target target);

	@Override
	public abstract String toString();

	public abstract void undo();
}
