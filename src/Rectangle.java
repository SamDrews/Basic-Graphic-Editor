import java.awt.*;

/**
 * Created by samdrews on 1/27/16.
 */
public class Rectangle extends Shape {
    private double myX, myY, width, height; // Rect's width, height, and x and y coordinates

    /**
     * Create a Rectangle, setting its color, x and y coordinates, width, and height
     * @param c the color you wish the shape to initially have
     */
    public Rectangle(Color c, Point p) {
        super(c);
        myX = p.x;
        myY = p.y;
        width = 0;
        height = 0;
    }

    public void drawShape(Graphics page) {
        page.fillRect((int)myX, (int)myY, (int)width, (int)height);
    }

    public boolean containsPoint(Point p) {
        return (myX < p.getX() && myY < p.getY()
                && myX + width > p.getX()
                && myY + height > p.getY());
    }

    public void move(int deltaX, int deltaY) {
        myX += deltaX;
        myY += deltaY;

    }

    public Point getCenter() {
        double midX = (width / 2) + myX;
        double midY = (height / 2) + myY;
        Point middle = new Point((int)midX, (int)midY);
        return middle;
    }
}
