import java.awt.*;

/**
 * Ellipse.java
 * Class for an ellipse.
 * 
 * Written by THC for CS 5 Lab Assignment 3.
 *
 * @author Thomas H. Cormen 
 * @see Shape
 */
public class Ellipse extends Shape {
  private double myX, myY, width, height;

  /**
   * Create an Ellipse, setting its color.
   *
   * @param c the color you wish the ellipse to initially have
   */
  public Ellipse(Color c, Point p) {
    super(c);
    myX = p.x;
    myY = p.y;
    width = 0;
    height = 0;
  }

  // Helper method that returns whether Point p is in an Ellipse with the given
  // top left corner and size.
  private static boolean pointInEllipse(Point p, int left, int top, int width,
      int height) {
    double a = width / 2.0; // half of the width
    double b = height / 2.0; // half of the height
    double centerx = left + a; // x-coord of the center
    double centery = top + b; // y-coord of the center
    double x = p.x - centerx; // horizontal distance between p and center
    double y = p.y - centery; // vertical distance between p and center

    // Now we just apply the standard geometry formula.
    // (See CRC, 29th edition, p. 178.)
    return Math.pow(x / a, 2) + Math.pow(y / b, 2) <= 1;
  }

  /**
   * Draw the Ellipse.
   *
   * @param page the page you wish to draw the ellipse on
   */
  public void drawShape(Graphics page) {
    page.fillOval((int)myX, (int)myY, (int)width, (int)height);
  }

  /**
   * Checks a given Point
   *
   * @param p the Point you wish to check
   * @return true if the Point is there
   */
  public boolean containsPoint(Point p) {
    return pointInEllipse(p, (int)myX, (int)myY, (int)width, (int)height);
  }

  /**
   * Moves Ellipse by updating its X and Y coordinates
   *
   * @param deltaX the change in X values
   * @param deltaY the change in Y values
   */
  public void move(int deltaX, int deltaY) {
    myX += deltaX;
    myY += deltaY;
  }

  /**
   * Gets the center of an Ellipse
   *
   * @return a Point in the center of en Ellipse
   */
  public Point getCenter() {
    double a = width / 2.0;
    double b = height / 2.0;
    double centerX = myX + a;
    double centerY = myY + b;
    Point newCenter = new Point((int)centerX, (int)centerY);
    return newCenter;
  }

  /**
   * Sets the width of an Ellipse
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
