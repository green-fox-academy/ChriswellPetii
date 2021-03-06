import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int sS = 10;
        int pieces = 19;
        int i;
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        drawSquare(graphics, sS, pieces);

    }

    private static void drawSquare(Graphics graphics, int sS, int pieces) {
        int i;
        for (i = 0; i < pieces; i++) {

            graphics.setColor(Color.magenta);
            graphics.fillRect(i * sS, i * sS, sS, sS);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(i * sS, i * sS, sS, sS);
        }
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