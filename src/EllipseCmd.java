import java.awt.*;

/**
 * EllipseCmd.java
 * Command class to perform a ellipse command.
 *
 * @author Samson Drews
 * @see Command
 */
public class EllipseCmd extends Command {
    private Color color;
    private double myX, myY, width, height;

    /**
     * On a mouse press, sets x and y coordinates, height, width, and color
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executePress(Point p, Drawing d) {
        myX = p.x;
        myY = p.y;
        width = 0;
        height = 0;
        color = d.getColor();

        d.makeShape(new Ellipse(color, p));
    }

    /**
     * When mouse is dragged, draws an Ellipse on canvas and
     *  when released will add an Ellipse to the canvas
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executeDrag(Point p, Drawing d) {
        width = Math.abs(p.x - myX);
        height = Math.abs(p.y - myY);

        Point origPoint = new Point((int)Math.min(p.x, myX), (int)Math.min(p.y, myY));
        Ellipse newEllip = new Ellipse(color, origPoint);

        newEllip.setHeight(height);
        newEllip.setWidth(width);

        d.createWhileDrag(newEllip);
    }
}

