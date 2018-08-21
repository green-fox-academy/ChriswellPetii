import javax.swing.*;
import java.awt.*;

public class Main extends JComponent {
    private static int MAX_DEPTH = 1;
    static int WIDTH = 500;
    static int HEIGHT = 500;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

//        int[] xPoints = {500 / 2, 500, 500 + (500 / 2)};
//        int[] yPoints = {0 + 500, 0, 0 + 500};
//        int nPoints = 3;
//        drawTriangles(g, xPoints, yPoints, nPoints, 0);
        int x = WIDTH / 2;
        int y = 0;
        int y2 = HEIGHT / 2;
        int size = x / 2;
        drawSierpinskyTriangle(x, y, y2, size, (Graphics2D) g, 0);

        Graphics2D graphics = (Graphics2D) g;

        int strokeWidth = 30;

    }

    private static void drawSierpinskyTriangle(int x, int y, int y2, int size, Graphics2D g, int depth) {
        if (depth > MAX_DEPTH) {
            return;
        }

        g.drawLine(x, y, x + (x / 2), y2 / 2);
        g.drawLine(x, y, x - (x / 2), y2 / 2);
        g.drawLine(x - (x / 2), y2 / 2, x + (x / 2), y2 / 2);

        drawSierpinskyTriangle(x, y, y2, size / 2, g, depth + 1);
        drawSierpinskyTriangle(x + size / 2, y, y2, size / 2, g, depth + 1);
        drawSierpinskyTriangle(x, y + size / 2, y2, size / 2, g, depth + 1);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Main main = new Main();
        main.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        frame.getContentPane().add(main);

        frame.pack();
        frame.setVisible(true);
    }
}