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

    /**
     * On a mouse press, sets x and y coordinates, height, width, and color
     *
     * @param p the Point where the mouse is clicked
     * @param dwg the Drawing to draw to the canvas
     */
    public void executePress(Point p, Drawing dwg) {
        myX = p.x;
        myY = p.y;
        width = 0;
        height = 0;
        color = dwg.getColor();

        dwg.makeShape(new Rectangle(color, p));
    }

    /**
     * When mouse is dragged, draws a Rectangle on canvas and
     *  when released will add a Rectangle to the canvas
     *
     * @param p the Point where the mouse is clicked
     * @param dwg the Drawing to draw to the canvas
     */
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
