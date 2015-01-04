package ie.ianduffy.templatemethod;

public class HitandRunMethod extends StealingMethod {

	@Override
	protected String pickTarget() {
		return "old goblin woman";
	}

	@Override
	protected void confuseTarget(String target) {
		System.out.println("Approach the " + target + " from behind.");
	}

	@Override
	protected void stealTheItem(String target) {
		System.out.println("Grab the goods and run away");
	}
}
