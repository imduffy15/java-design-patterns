package ie.ianduffy.abstractfactory;

public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

	@Override
	public String toString() {
		return "Elf Kingdom";
	}
}
