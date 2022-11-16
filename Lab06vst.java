// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);


        // Draw Random Lines

        Random rand = new Random();
        for (int k = 0; k < 101; k++) {
            int x1 = rand.nextInt(365) + 10;
            int y1 = rand.nextInt(290) + 10;
            int x2 = rand.nextInt(365) + 10;
            int y2 = rand.nextInt(290) + 10;
            int r = rand.nextInt(255);
            int gr = rand.nextInt(255);
            int b = rand.nextInt(255);
            g.setColor(new Color(r, gr, b));
            g.drawLine(x1, y1, x2, y2);
        }

        // Draw Random Squares
        Random sqre = new Random();
        for (int k = 0; k < 101; k++) {
            int x1 = sqre.nextInt(340) + 400;
            int y1 = sqre.nextInt(240) + 10;
            int r = rand.nextInt(255);
            int gr = rand.nextInt(255);
            int b = rand.nextInt(255);
            g.setColor(new Color(r, gr, b));
            g.fillRect(x1, y1, 50, 50);
        }

        // Draw Random Circles

        Random oval = new Random();
        for (int k = 0; k < 101; k++) {
            int diameter = rand.nextInt(200);
            int x1 = oval.nextInt(390 - diameter) + 10;
            int y1 = oval.nextInt(290 - diameter) + 300;
            int r = rand.nextInt(255);
            int gr = rand.nextInt(255);
            int b = rand.nextInt(255);
            g.setColor(new Color(r, gr, b));
            g.drawOval(x1, y1, diameter, diameter);


        }
            // Draw 3-D Box

            for (int k = 0; k < 101; k++) {
                // yellow square
                g.setColor(Color.yellow);
                g.fillRect(550,400,100,100);
             // red square
                g.setColor(new Color(255,0,0));
                g.fillRect(600, 450, 100, 100);

                // blue tri
                Polygon pent = new Polygon();
                pent.addPoint(650,400);
                pent.addPoint(700,450);
                pent.addPoint(650,450);
                g.setColor(Color.blue);
                g.fillPolygon(pent);

                // green poly

                Polygon penta = new Polygon();
                penta.addPoint(550,400);
                penta.addPoint(600,450);
                penta.addPoint(600,550);
                penta.addPoint(550,500);
                g.setColor(Color.green);
                g.fillPolygon(penta);



            }

        }

    }


 