package ie.ianduffy.templatemethod;

public class App {
	public static void main(String[] args) {
		HalfingThief thief = new HalfingThief(new HitandRunMethod());
		thief.steal();
		thief.changeMethod(new SubtleMethod());
		thief.steal();
	}
}
