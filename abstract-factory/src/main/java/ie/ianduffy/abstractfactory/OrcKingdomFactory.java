package ie.ianduffy.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {

	@Override
	public Army createArmy() {
		return new OrcArmy();
	}

	@Override
	public Castle createCastle() {
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		return new OrcKing();
	}

	@Override
	public String toString() {
		return "Orc Kingdom";
	}
}
