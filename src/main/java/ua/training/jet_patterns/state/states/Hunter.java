package ua.training.jet_patterns.state.states;

import ua.training.jet_patterns.state.Position;

public class Hunter implements State {

	public String act(Position pos) {
		return pos.getPosition().equals("Forest") ? "Hunter is hunting." : 
													 "Hunter is waiting.";
	}

}
