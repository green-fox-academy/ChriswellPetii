import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int[][] xyEndPoints = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        int[][] xyStartPoints = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int i = 0;
        int k = 0;

        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        for (i = 0; i < xyStartPoints.length; i++) {
            connectBox(graphics, i);


        }
        for (k = 0; k < xyEndPoints.length ; k++) {
            connectThese(graphics, k);

        }


    }

    public static void connectBox(Graphics graphics, int i) {
        int[][] xyStartPoints = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        graphics.setColor(Color.green);
        if (i + 1 != xyStartPoints.length) {
            graphics.drawLine(xyStartPoints[i][0], xyStartPoints[i][1], xyStartPoints[i + 1][0], xyStartPoints[i + 1][1]);
        } else {
            graphics.drawLine(xyStartPoints[i][0], xyStartPoints[i][1], xyStartPoints[0][0], xyStartPoints[0][1]);
        }

    }

    public static void connectThese(Graphics graphics, int k) {
        int[][] xyEndPoints = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        graphics.setColor(Color.green);
        if (k + 1 != xyEndPoints.length) {
            graphics.drawLine(xyEndPoints[k][0], xyEndPoints[k][1], xyEndPoints[k + 1][0], xyEndPoints[k + 1][1]);
        } else {
            graphics.drawLine(xyEndPoints[k][0], xyEndPoints[k][1], xyEndPoints[0][0], xyEndPoints[0][1]);
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


// create a 300x300 canvas.