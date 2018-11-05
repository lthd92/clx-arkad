package com.arkad.competition.solve;

public interface Node {

	public void compute();
    public int getValue();
	public boolean isDone();
	public List<Node> getDependencies();
	
}
