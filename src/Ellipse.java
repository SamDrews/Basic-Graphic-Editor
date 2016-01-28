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
  /**
   * Create a Shape, setting its color.
   *
   * @param c the color you wish the shape to initially have
   */
  public Ellipse(Color c) {
    super(c);
  }
  // YOU FILL IN INSTANCE VARIABLES AND METHODS.

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

  @Override
  public void drawShape(Graphics page) {

  }

  @Override
  public boolean containsPoint(Point p) {
    return false;
  }

  @Override
  public void move(int deltaX, int deltaY) {

  }

  @Override
  public Point getCenter() {
    return null;
  }
}
