package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import engine.entity.Player;
import engine.process.Map;
import engine.process.MobileElementManager;

public class GameDisplay extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private PaintStrategy paintStrategy = new PaintStrategy();
    private MobileElementManager mobileManager;
    private Map map;
    
    public GameDisplay(MobileElementManager mobileManager, Map map){   
    	this.mobileManager = mobileManager;
    	this.map = map;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        Player player = mobileManager.getPlayer();
        
        paintStrategy.paint(map, g2);
        
        paintStrategy.paint(player, g2);
        
    }

    

}
