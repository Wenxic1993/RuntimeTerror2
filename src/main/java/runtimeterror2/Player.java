package runtimeterror2;

public class Player extends GameEntity {
	
	public String uniqueMessage;
	public int[] playerOrigin;
	
	// TO BE IMPLEMENTED
	// move method
	public int[] playerMove(String userInput) {
		// description: takes in user input, returns array based on movements
		// Outputs:
			// up = [0,1]
			// down = [0,-1]
			// left = [-1,0]
			// right = [1,0]
		int[] arrayToReturn = {0, 0};
		if (userInput.toLowerCase().equals("w")) {
			arrayToReturn[0] = 0;
			arrayToReturn[1] = 1;
		}
		else if (userInput.toLowerCase().equals("a")) {
			arrayToReturn[0] = -1;
			arrayToReturn[1] = 0;
		}
		else if (userInput.toLowerCase().equals("s")) {
			arrayToReturn[0] = 0;
			arrayToReturn[1] = -1;
		}
		else if (userInput.toLowerCase().equals("d")) {
			arrayToReturn[0] = 1;
			arrayToReturn[1] = 0;
		}
		System.out.println(arrayToReturn[0]+", "+arrayToReturn[1]);
		return arrayToReturn;
	}
	

}
