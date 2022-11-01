package runtimeterror2;

public class RunGame {
	
	// potential idea: hotter or colder concept applied to monster
	
	public static boolean isGameOver;
	
	// new grid
	public static GameGrid currGameGrid = new GameGrid();

	
	public static void runGame() {
		
		// initialise game grid
		currGameGrid.gameGridInit();	
		
		while (isGameOver==false) {
			// take user input
			UserInput input = new UserInput();
			String uInput = UserInput.readInput();
			
			// if they want to quit
			if (uInput.equals("q")) {
				isGameOver = true;
				break;
			}
			
			int playerPlay[] = currGameGrid.gridMovePlayer(uInput);
			
			// checking player move within boundaries
			if (currGameGrid.outOfBounds(playerPlay)) {
				
				boolean askAgain = true;
				while (askAgain==true) {
					System.out.println("Input out of bounds!");
					
					uInput = input.readInput();
					playerPlay = currGameGrid.gridMovePlayer(uInput);
					
					if (!currGameGrid.outOfBounds(playerPlay)) {
						askAgain = false;
					}
				}
			}
			
			// update player position
			currGameGrid.updatePlayerPosition(uInput);
			
			
			// detect collision
				// if detect collision returns 0, reset player position
				// if detect collision returns 1, isGameOver = true and break while
			System.out.println("before collision detect");
			int detectCollisionResult = currGameGrid.detectCollision();
			System.out.println("after collision detect");
			if (detectCollisionResult == 0) {
				currGameGrid.resetPlayerPosition();
			} else if (detectCollisionResult == 1) {
				isGameOver = true;
				break;
			}
			
			currGameGrid.displayGrid();
			
			
		}
	}
}
