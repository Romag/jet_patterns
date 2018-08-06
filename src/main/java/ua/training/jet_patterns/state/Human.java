package ua.training.jet_patterns.state;

import ua.training.jet_patterns.state.states.State;

public class Human {
	private Position pos;
	private State state;
	
	public Human() {
		this.pos = new Position("Narnia");
		state = new State() {

			public String act(Position pos) {
				return "Person is free painter.";
			}
			
		};
	}
	
	public Human(Position pos, State state) {
		this.pos = pos;
		this.state = state; 
	}
	
	public String reactToEnvironment() {
		return state.act(pos);
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
