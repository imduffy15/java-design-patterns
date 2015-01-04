package ie.ianduffy.memento;

import java.util.Stack;

public class App {
	public static void main(String[] args) {
		Stack<StarMemento> states = new Stack<>();

		Star star = new Star(StarType.SUN, 10000000, 500000);

		for(int i=0;i<4;i++) {
			System.out.println(star);
			states.add(star.getMemento());
			star.timePasses();
		}

		System.out.println("restoring states: ");

		while(states.size() > 0) {
			star.setMemento(states.pop());
			System.out.println(star);
		}

	}
}
