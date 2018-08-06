package ua.training.jet_patterns.state.states;

import ua.training.jet_patterns.state.Position;

public class Fisher implements State {

	public String act(Position pos) {
		return pos.getPosition().equals("Lake") ? "Fisher is fishing." : 
													"Fisher is waiting.";
	}

}
