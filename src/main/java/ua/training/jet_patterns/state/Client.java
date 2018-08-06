package ua.training.jet_patterns.state;

import ua.training.jet_patterns.state.states.*;

public class Client {

	public static void main(String[] args) {
		Human h = new Human();
		System.out.println(h.reactToEnvironment());
		
		h.setPos(new Position("Meadow"));
		h.setState(new Mushroomer());
		System.out.println(h.reactToEnvironment());
		
		h.setPos(new Position("Meadow"));
		h.setState(new Hunter());
		System.out.println(h.reactToEnvironment());
		
		h.setPos(new Position("Lake"));
		h.setState(new Mushroomer());
		System.out.println(h.reactToEnvironment());
		
	}
	

}
