import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int xMiddle = WIDTH / 2;
        int yMiddle = HEIGHT / 2;
        int x = 0;
        int y = 0;
        int lines = 20;
        int stepY = yMiddle / lines;
        int stepX = xMiddle / lines;
        int i = 0;
        drawGreenStar(graphics, xMiddle, yMiddle, x, y, lines, stepY, stepX);

    }

    private static void drawGreenStar(Graphics graphics, int xMiddle, int yMiddle, int x, int y, int lines, int stepY, int stepX) {
        drawFirstQLines(graphics, xMiddle, yMiddle, y, lines, stepY, stepX);
        drawSecondQLines(graphics, xMiddle, yMiddle, x, lines, stepY, stepX);
        drawThirdQLines(graphics, xMiddle, yMiddle, lines, stepY, stepX);
        drawFourthQLines(graphics, xMiddle, yMiddle, lines, stepY, stepX);
    }

    private static void drawFourthQLines(Graphics graphics, int xMiddle, int yMiddle, int lines, int stepY, int stepX) {
        int i;
        for (i = 0; i <= lines; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(xMiddle, yMiddle - (i * stepY), WIDTH - (i * stepX), yMiddle);
        }
    }

    private static void drawThirdQLines(Graphics graphics, int xMiddle, int yMiddle, int lines, int stepY, int stepX) {
        int i;
        for (i = 0; i <= lines; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(xMiddle, HEIGHT - (i * stepY), xMiddle + (i * stepX), yMiddle);
        }
    }

    private static void drawSecondQLines(Graphics graphics, int xMiddle, int yMiddle, int x, int lines, int stepY, int stepX) {
        int i;
        for (i = 0; i <= lines; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(x + (i * stepX), yMiddle, xMiddle, yMiddle + (i * stepY));
        }
    }

    private static void drawFirstQLines(Graphics graphics, int xMiddle, int yMiddle, int y, int lines, int stepY, int stepX) {
        int i;
        for (i = 0; i <= lines; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(xMiddle, y + (i * stepY), xMiddle - (i * stepX), yMiddle);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 340;

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
