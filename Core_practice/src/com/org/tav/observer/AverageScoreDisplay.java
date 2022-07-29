package com.org.tav.observer;

public class AverageScoreDisplay {

	private float runRate;
	private int AsumeScore;
	
	public void update(int runs , int wickets , float overs) {
		this.runRate = runs/overs;
		this.AsumeScore = (int) (this.runRate * 50);
		display();
	}
	
	public void display() {
		System.out.println("\n Average Score display:"+" Run Rate : "+runRate+" \nAsumScore "+ AsumeScore);
	}
}
