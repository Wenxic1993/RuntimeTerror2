package com.qa.runtimeterror2;

public class GameEntity {
	
	// location
	// unique message
	public static int posX;
	public static int posY;
	
	
	// entity (subclasses) = treasure, monster, player
	
	// TO BE IMPLEMENTED
	public int[] getPosition() {
		// description: take posX and posY, return as array
		int a[]= {posX,posY};
		return a;
	}
	
	// TO BE IMPLEMENTED
	public static void setPosition(int pos[]) {
		// description: player posX=0, posY=0
		posX=pos[0];
		posY=pos[1];
	}
		
	


}
