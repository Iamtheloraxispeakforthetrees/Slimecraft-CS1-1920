/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slormcraft;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;


/**
 *
 * @author 801420
 */
public class World extends JPanel {
    //private ArrayList<Blob> blobs = new ArrayList<>();
    //private ArrayList<Clob> clobs = new ArrayList<>();
    private ArrayList<Sprite> sprites = new ArrayList<>();
    Timer timer;
            
    public World() {
         timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/30);
        super.setSize(800, 600);
        for (int i = 0; i < 200; i++) {
            int x = (int) (Math.random() * 800 / 2);
            int y = (int) (Math.random() * 600);
            sprites.add(new Blob(x,y));    
        }
        for (int i = 0; i < 200; i++) {
            int x = (int) (Math.random() * 800 / 2 + 800 / 2);
            int y = (int) (Math.random() * 600);
            sprites.add(new Glob(x,y));    
        }
        
        for (int i = 0; i < 200; i++) {
            int x = (int) (Math.random() * 800 / 2 + 800 / 2);
            int y = (int) (Math.random() * 600);
            sprites.add(new Food(x,y));    
        }         
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Sprite sprite : sprites) {
            sprite.draw(g);
            sprite.update();
        }
    }
    
    private class ScheduleTask extends TimerTask {
        @Override
        public void run() {
            repaint();
        }
    }
}
