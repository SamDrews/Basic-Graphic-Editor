import java.awt.*;

/**
 * Rectangle.java
 * Class for a Rectangle.
 *
 * @author Samson Drews
 * @see Shape
 */
public class Rectangle extends Shape {
    private double myX, myY, width, height; // Rect's width, height, and x and y coordinates

    /**
     * Create a Rectangle, setting its color, x and y coordinates, width, and height
     *
     * @param c the color you wish the rectangle to initially have
     */
    public Rectangle(Color c, Point p) {
        super(c);
        myX = p.x;
        myY = p.y;
        width = 0;
        height = 0;
    }

    /**
     * Draw the Rectangle.
     *
     * @param page the page you wish to draw the rectangle on
     */
    public void drawShape(Graphics page) {
        page.fillRect((int)myX, (int)myY, (int)width, (int)height);
    }

    /**
     * Checks for a given Point
     *
     * @param p the Point you wish to check
     * @return true if the Point is there
     */
    public boolean containsPoint(Point p) {
        return (myX < p.getX() && myY < p.getY()
                && myX + width > p.getX()
                && myY + height > p.getY());
    }

    /**
     * Moves Rectangle by updating its X and Y coordinates
     *
     * @param deltaX the change in X values
     * @param deltaY the change in Y values
     */
    public void move(int deltaX, int deltaY) {
        myX += deltaX;
        myY += deltaY;

    }

    /**
     * Gets the center of a Rectangle
     *
     * @return a Point in the center of a Rectangle
     */
    public Point getCenter() {
        double midX = (width / 2) + myX;
        double midY = (height / 2) + myY;
        Point middle = new Point((int)midX, (int)midY);
        return middle;
    }

    /**
     * Sets the width of a Rectangle
     *
     * @param width the new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the width of a Rectangle
     *
     * @param height the new height
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
