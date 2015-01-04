package ie.ianduffy.templatemethod;

public class SubtleMethod extends StealingMethod {

	@Override
	protected String pickTarget() {
		return "shop keeper";
	}

	@Override
	protected void confuseTarget(String target) {
		System.out.println("Approach the " + target + " while crying and hug him.");
	}

	@Override
	protected void stealTheItem(String target) {
		System.out.println("While in close contact grab wallet");
	}
}
