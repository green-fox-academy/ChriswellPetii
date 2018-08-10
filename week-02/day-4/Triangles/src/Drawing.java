import javafx.scene.shape.TriangleMesh;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        drawMoreTriangle(graphics);
    }

    public static void drawMoreTriangle(Graphics graphics) {
        int side = 20;
        int height = side / 2;
        int i = 0;
        int j = 0;

        for (j = 0; j < 50; j++) {
            for (i = ((WIDTH / side) - j ); i > 0; i -= 1) {
                drawTriangle(graphics, side, height, i, j);
            }
        }
    }

    private static void drawTriangle(Graphics graphics, int side, int height, int i, int j) {
        int x = (i * side) + (j * height);
        int y = HEIGHT - (j * height);

        int[] xPoints = {x, (side / 2) + x, side + x};
        int[] yPoints = {y, y - height, y};
        int triangle = 3;
        graphics.drawPolygon(xPoints, yPoints, triangle);
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
