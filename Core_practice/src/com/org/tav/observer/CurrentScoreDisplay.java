package com.org.tav.observer;

public class CurrentScoreDisplay {
private int  runs , wickets ; 
private float overs;
public void update(int runs , int wickets , float overs) {

	this.runs = runs;
	this.wickets = wickets;
	this.overs = overs;
	display();
	
}

public void display() {
	System.out.println("\n current e Score display:"+" Runs : "+runs +" \n Overs "+ overs);
}
}
