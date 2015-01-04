package ie.ianduffy.mediator;

public interface PartyMember {
	void joinedParty(Party party);
	void partyAction(Action action);
	void act(Action act);
}
