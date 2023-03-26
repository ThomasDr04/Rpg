package engine.process;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
    private MobileElementManager manager;
    
    public KeyHandler(MobileElementManager manager) {
    	this.manager = manager;
    }

    public static boolean up, down, left, right;

    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int code = e.getKeyCode();
        
        if (code == KeyEvent.VK_Z) {
        	up = true;
        }
        if (code == KeyEvent.VK_S) {
        	down = true;
        }
        if (code == KeyEvent.VK_Q) {
        	left = true;
        }
        if (code == KeyEvent.VK_D) {
        	right = true;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    	int code = e.getKeyCode();
    	
        if (code == KeyEvent.VK_Z) {
        	up = false;
        }
        if (code == KeyEvent.VK_S) {
        	down = false;
        }
        if (code == KeyEvent.VK_Q) {
        	left = false;
        }
        if (code == KeyEvent.VK_D) {
        	right = false;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
