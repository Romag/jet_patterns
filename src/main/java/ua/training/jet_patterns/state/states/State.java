package ua.training.jet_patterns.state.states;

import ua.training.jet_patterns.state.Position;

public interface State {
	public String act(Position pos);
}
