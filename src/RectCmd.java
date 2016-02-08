import java.awt.*;

/**
 * RectCmd.java
 * Command class to perform a rectangle command.
 *
 * @author Samson Drews
 * @see Command
 */
public class RectCmd extends Command {
    private Color color; // Rect's color
    private double myX, myY, width, height; // Rect's width, height, and x and y coordinates

    public void executePress(Point p, Drawing dwg) {
        myX = p.x;
        myY = p.y;
        width = 0;
        height = 0;
        color = dwg.getColor();

        dwg.makeShape(new Rectangle(color, p));
    }

    public void executeDrag(Point p, Drawing dwg) {
        width = Math.abs(p.x - myX);
        height = Math.abs(p.y - myY);

        Point origPoint = new Point((int)Math.min(p.x, myX), (int)Math.min(p.y, myY));
        Rectangle newRect = new Rectangle(color, origPoint);

        newRect.setHeight(height);
        newRect.setWidth(width);

        dwg.createWhileDrag(newRect);
    }
}
