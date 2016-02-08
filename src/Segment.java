import java.awt.*;

/**
 * Segment.java
 * Class for a line segment.
 * 
 * Written by THC for CS 5 Lab Assignment 3.
 *
 * @author Thomas H. Cormen
 * @see Shape
 */
public class Segment extends Shape {
  private double initX, initY, finalX, finalY;
  private final static int THE_TOLERANCE = 3;
  /**
   * Create a Shape, setting its color.
   *
   * @param c the color you wish the shape to initially have
   */
  public Segment(Color c, Point initP, Point finalP) {
    super(c);
    initX = initP.x;
    initY = initP.y;
    finalX = finalP.x;
    finalY = finalP.y;
  }


  // Helper method that returns true if Point p is within a tolerance of a
  // given bounding box. Here, the bounding box is given by the coordinates of
  // its left, top, right, and bottom.
  private static boolean almostContainsPoint(Point p, int left, int top,
      int right, int bottom, double tolerance) {
    return p.x >= left - tolerance && p.y >= top - tolerance
        && p.x <= right + tolerance && p.y <= bottom + tolerance;
  }

  // Helper method that returns the distance from Point p to the line
  // containing a line segment whose endpoints are given.
  private static double distanceToPoint(Point p, int x1, int y1, int x2,
      int y2) {
    if (x1 == x2) // vertical segment?
      return (double) (Math.abs(p.x - x1)); // yes, use horizontal distance
    else if (y1 == y2) // horizontal segment?
      return (double) (Math.abs(p.y - y1)); // yes, use vertical distance
    else {
      // Here, we know that the segment is neither vertical nor
      // horizontal.
      // Compute m, the slope of the line containing the segment.
      double m = ((double) (y1 - y2)) / ((double) (x1 - x2));

      // Compute mperp, the slope of the line perpendicular to the
      // segment.
      double mperp = -1.0 / m;

      // Compute the (x, y) intersection of the line containing the
      // segment and the line that is perpendicular to the segment and that
      // contains Point p.
      double x = (((double) y1) - ((double) p.y) - (m * x1) + (mperp * p.x))
          / (mperp - m);
      double y = m * (x - x1) + y1;

      // Return the distance between Point p and (x, y).
      return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
  }


  public void drawShape(Graphics page) {
    page.drawLine((int)initX, (int)initY, (int)finalX, (int)finalY);
  }


  public boolean containsPoint(Point p) {
    boolean hasPoint = almostContainsPoint(p, (int)initX, (int)initY, (int)finalX, (int)finalY, THE_TOLERANCE);
    double distance = distanceToPoint(p, (int)initX, (int)initY, (int)finalX, (int) finalY);
    if (hasPoint && distance <= THE_TOLERANCE) {
      return true;
    }
    return false;
  }


  public void move(int deltaX, int deltaY) {
    initX += deltaX;
    finalX += deltaX;
    initY += deltaY;
    finalY += deltaY;
  }


  public Point getCenter() {
    double x = (initX + finalX) / 2;
    double y = (initY + finalY) / 2;
    Point newCenter = new Point((int)x, (int)y);
    return newCenter;
  }

  public int setFinalX(int x) { //Returns the final point
    x = (int)finalX;
    return x;
  }

  public int setFinalY(int y) {
    y = (int)finalY;
    return y;
  }

}
