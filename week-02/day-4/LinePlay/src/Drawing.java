import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;
        int i = 0;
        int lines = 25;
        int a = (WIDTH / lines);

        drawMagnetaLines(graphics, x, y, lines, a);
        drawGreenLines(graphics, x, y, lines, a);
    }

    private static void drawGreenLines(Graphics graphics, int x, int y, int lines, int a) {
        int i;
        for (i = 1; i <= lines; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(x, y + (i * a), x + (i * a), WIDTH);
        }
    }

    private static void drawMagnetaLines(Graphics graphics, int x, int y, int lines, int a) {
        int i;
        for (i = 1; i <= lines; i++) {
            graphics.setColor(Color.magenta);
            graphics.drawLine(x + (i * a), y, WIDTH, y + (i * a));
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
