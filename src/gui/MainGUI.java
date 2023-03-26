package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

import engine.process.*;
import config.GameConfiguration;

public class MainGUI extends JFrame implements Runnable{

    private static final long serialVersionUID = 1L;

    private final static Dimension preferredSize = new Dimension(GameConfiguration.WINDOW_WIDTH, GameConfiguration.WINDOW_HEIGHT);
    private KeyHandler keyH;
    private MobileElementManager mobileManager;
    private Map map;
    private GameDisplay dashboard;

    public MainGUI(String title){
        super(title);
        init();
    }
    private void init(){
    	
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        map = GameBuilder.buildMap("RPG/src/maps_text/map1.txt");
        mobileManager = GameBuilder.buildInitMobile();
        dashboard = new GameDisplay(mobileManager,map);
        
        keyH = new KeyHandler(mobileManager);
 
        dashboard.addKeyListener(keyH);
        dashboard.setFocusable(true);
        
        dashboard.setPreferredSize(preferredSize);
        contentPane.add(dashboard, BorderLayout.CENTER);
        
        dashboard.setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setPreferredSize(preferredSize);
        setResizable(false);
        setLocationRelativeTo(null);;
        setVisible(true);
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
    	double drawInterval = 1000000000/GameConfiguration.FPS;
    	double nextDrawTime = System.nanoTime()+drawInterval;
    	
        while(true){
        	mobileManager.updatePlayerMoves();
        	dashboard.repaint(); 
        	try {
        		double remainingTime = nextDrawTime - System.nanoTime();
        		remainingTime = remainingTime / 1000000;
        		
        		if(remainingTime < 0) {
        			remainingTime = 0;
        		}
        		Thread.sleep((long) remainingTime);
        		
        		nextDrawTime += drawInterval;
        	}catch (InterruptedException e) {
        		System.out.println(e.getMessage());
        	}
        }
    }
}
