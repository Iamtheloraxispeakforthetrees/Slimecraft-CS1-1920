 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slormcraft;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 801420
 */
public class Food extends Sprite {
    private static final int WIDTH = 15;
    private static final int HEIGHT = 15;
    
    public Food(int speed, int x, int y, Color color) {
        super(speed, x, y, WIDTH, HEIGHT, color);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
