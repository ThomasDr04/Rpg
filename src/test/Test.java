package test;
import gui.MainGUI;

/** 
/* @author Thomas Drault / Kirty Chanemougam / Antonin Watier 
 **/

 public class Test {
    public static void main(String[] args) {
        MainGUI gameMainGUI = new MainGUI("RPG");
        Thread gameThread = new Thread(gameMainGUI);
        gameThread.start();
    }
 }  