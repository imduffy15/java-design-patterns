package ie.ianduffy.command;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Target {

	private Size size;

	private Visibility visibility;

	public void printStatus() {
		System.out.println(
				String.format("%s, size=%s visibility=%s", this, getSize(), getVisibility()));
	}

	@Override
	public abstract String toString();
}
