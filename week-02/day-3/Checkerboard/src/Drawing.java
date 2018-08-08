import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        for (int j = 0; j < 35; j++) {

            if (j % 2 != 0) {
                for (int i = 0; i < 35; i++) {
                    if (i % 2 == 0) {
                        drawSquareBlack(graphics, i, j);
                    } else drawSquareWhite(graphics, i, j);


                }
            } else for (int i = 0; i < 35; i++) {
                if (i % 2 != 0) {
                    drawSquareBlack(graphics, i, j);
                } else drawSquareWhite(graphics, i, j);
            }

        }

    }

    public static void drawSquareBlack(Graphics graphics, int i, int j) {
        int x = 0;
        int y = 0;
        int sS = 10;
        graphics.fillRect(x + (i * sS), y + (j * sS), sS, sS);
    }

    public static void drawSquareWhite(Graphics graphics, int i, int j) {
        int x = 0;
        int y = 0;
        int sS = 10;
        graphics.drawRect(x + (i * sS), y + (j * sS), sS, sS);
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