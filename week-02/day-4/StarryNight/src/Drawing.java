import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int sS = 2;
        int pieces = 250;
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        setBlackBackground(graphics);
        drawStars(graphics, sS, pieces);

    }

    private static void drawStars(Graphics graphics, int sS, int pieces) {


        for (int i = 0; i <= pieces; i++) {
            int gray = (int) Math.ceil(Math.random() * 100);
            int positionX = (int) Math.ceil(Math.random() * 320);
            int positionY = (int) Math.ceil(Math.random() * 320);
            graphics.setColor(new Color(255, 255, 255, gray));
            graphics.fillRect(positionX, positionY, sS, sS);
        }
    }

    private static void setBlackBackground(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
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