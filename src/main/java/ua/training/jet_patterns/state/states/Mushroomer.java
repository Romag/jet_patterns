package ua.training.jet_patterns.state.states;

import ua.training.jet_patterns.state.Position;

public class Mushroomer implements State {

	public String act(Position pos) {
		return pos.getPosition().equals("Meadow") ? "Mushroomer is picking mushrooms." :
													 "Mushroomer is waiting.";
	}

}
