import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int size = 10;
        int i;
        int pieces = 6;
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        draw3DSquare(graphics, size, pieces);
    }

    private static void draw3DSquare(Graphics graphics, int size, int pieces) {
        int i;
        for (i = 0; i <= pieces; i++) {
            int startPoint = ((i * size) * (i - 1) / 2);

            graphics.setColor(Color.magenta);
            graphics.fillRect(((i * size) * (i - 1) / 2), ((i * size) * (i - 1) / 2), i * size, i * size);

            graphics.setColor(Color.black);
            graphics.drawRect(((i * size) * (i - 1) / 2), ((i * size) * (i - 1) / 2), i * size, i * size);


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