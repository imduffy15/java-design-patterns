package ie.ianduffy.visitor;

public interface UnitVisitor {

	void visitSoldier(Soldier solder);
	void visitSergeant(Sergeant sergeant);
	void visitCommander(Commander commander);

}
