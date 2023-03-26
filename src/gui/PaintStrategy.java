package gui;

import java.awt.Graphics2D;
import java.awt.Image;

import config.GameConfiguration;
import engine.map.Block;
import engine.entity.Player;
import engine.process.Map;
import engine.process.Utility;

public class PaintStrategy{
	
    public void paint(Player player, Graphics2D g2){
    	Image image = null;
    	
        switch(player.getDirection()) {
        case "up":
        	if(player.getSpriteNumber() == 1) {
        		image = Utility.readImage("images/top1.png");
        	}
        	else{
        		image = Utility.readImage("images/top2.png");
        	}
        	break;
        	
        case "down":
        	if(player.getSpriteNumber() == 1) {
        		image = Utility.readImage("images/down1.png");
        	}
        	else{
        		image = Utility.readImage("images/down2.png");
        	}
        	break;
        	
        case "left":
        	if(player.getSpriteNumber() == 1) {
        		image = Utility.readImage("images/left1.png");
        	}
        	else{
        		image = Utility.readImage("images/left2.png");
        	}
        	break;
        	
        case "right":
        	if(player.getSpriteNumber() == 1) {
        		image = Utility.readImage("images/right1.png");
        	}
        	else{
        		image = Utility.readImage("images/right2.png");
        	} 
        	break;
        }
        g2.drawImage(image, player.getPositionX(), player.getPositionY(), GameConfiguration.BLOCK_SIZE, GameConfiguration.BLOCK_SIZE, null);
    }
    
    public void paint(Map map, Graphics2D g2) {
    	Block[][] blocks = map.getBlocks();
    	for(int rowIndex = 0; rowIndex < GameConfiguration.ROW_COUNT; rowIndex++) {
    		for(int columnIndex = 0; columnIndex < GameConfiguration.COLUMN_COUNT; columnIndex++) {
    			int positionX = blocks[rowIndex][columnIndex].getPositionX();
    			int positionY = blocks[rowIndex][columnIndex].getPositionY();
    			Image image = blocks[rowIndex][columnIndex].getImage();
    			g2.drawImage(image, positionX, positionY, GameConfiguration.BLOCK_SIZE, GameConfiguration.BLOCK_SIZE, null);
    		}
    	}
    }
}