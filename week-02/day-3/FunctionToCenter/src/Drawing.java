import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int i = 0;
        int j = 0;
        int l = 0;
        int k = 0;
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        for (i = 0; i < 16; i++) {
            drawLine(graphics, i, j);

        }
        for (j = 0; j <= i; j++) {
            drawLine(graphics, i, j);
        }

    }

    public static void drawLine(Graphics graphics, int i, int j) {
        int x = 0;
        int y = 0;
        int a = 20;
        graphics.drawLine(x + (i * a), y + (j * a), (WIDTH / 2), (HEIGHT / 2));
        graphics.drawLine(x + (j * a), y + (i * a), (WIDTH / 2), (HEIGHT / 2));
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}