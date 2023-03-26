package engine.process;

import config.GameConfiguration;
import engine.entity.*;

public class MobileElementManager {
    private Player player;
    private int spriteCounter;
    private int spriteNumber;
    
	public MobileElementManager() {
		player = new Player(GameConfiguration.WINDOW_WIDTH/2, GameConfiguration.WINDOW_HEIGHT/2);
		player.setDirection("up");
		spriteCounter = 0;
		spriteNumber = 1;
		
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}

	public void updatePlayerMoves() {
	// this method is called 60 times per second in the gameThread
		if (KeyHandler.up == true || KeyHandler.down == true || KeyHandler.right == true || KeyHandler.left == true) {
		if(KeyHandler.up == true) {
			player.setDirection("up");
			int position = player.getPositionY();
			position -= GameConfiguration.PLAYER_SPEED;
			player.setPositionY(position);	
		}
		else if(KeyHandler.down == true) {
			player.setDirection("down");
			int position = player.getPositionY();
			position += GameConfiguration.PLAYER_SPEED;
			player.setPositionY(position);	
		}
		else if(KeyHandler.left == true) {
			player.setDirection("left");
			int position = player.getPositionX();
			position -= GameConfiguration.PLAYER_SPEED;
			player.setPositionX(position);	
		}
		else if(KeyHandler.right == true) {
			player.setDirection("right");
			int position = player.getPositionX();
			position += GameConfiguration.PLAYER_SPEED;
			player.setPositionX(position);	
		}
		
		spriteCounter++;
		if(spriteCounter > 6) {
			if (spriteNumber == 1) {
				spriteNumber = 2;
			}
			else if(spriteNumber == 2){
				spriteNumber = 1;
			}
			player.setSpriteNumber(spriteNumber);
			spriteCounter = 0;
		}
	}
	} 
}
