package ie.ianduffy.abstractfactory;

public class App {

	private static void createKingdom(KingdomFactory factory) {
		King king = factory.createKing();
		Castle castle = factory.createCastle();
		Army army = factory.createArmy();
		System.out.println("A " + factory + " was created.");
		System.out.println(king);
		System.out.println(castle);
		System.out.println(army);
		System.out.println();
	}

	public static void main(String[] args) {
		createKingdom(new ElfKingdomFactory());
		createKingdom(new OrcKingdomFactory());
	}
}
