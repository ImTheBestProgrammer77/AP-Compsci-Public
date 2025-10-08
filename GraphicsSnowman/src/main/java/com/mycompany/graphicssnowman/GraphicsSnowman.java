/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graphicssnowman;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author AMoylan2026
 */
public class GraphicsSnowman extends JPanel{
    public GraphicsSnowman(){
        super();
    }

    public void paintComponent(Graphics g){
       g.fillRect(150, 40, 50, 20);
       g.drawLine(140, 60, 210, 60);
       g.drawOval(150, 60, 50, 50);
       g.fillOval(180, 70, 10, 10);
       g.fillOval(160, 70, 10, 10);
       g.drawOval(142, 110, 60, 60);
       g.drawOval(135, 170, 70, 70);
       g.drawArc(160, 90, 20, 50, 45, 90);
       g.drawString("I'm Melting!", 220, 100);
       g.setColor(Color.YELLOW);
       g.fillOval(0, 0, 65, 65);
       g.setColor(Color.GREEN);
       g.fillRect(0, 230, 500, 50);
          
    }
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        GraphicsSnowman panel = new GraphicsSnowman();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
