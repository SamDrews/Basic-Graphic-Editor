import java.awt.*;

/**
 * MoveCmd.java
 * Command class to perform a move command.
 *
 * @author Samson Drews
 * @see Command
 */

public class MoveCmd extends Command {
    private Shape s;
    private Point originPoint;

    /**
     * On a mouse press, sets the origin Point
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executePress(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);
        if (s != null) {
            originPoint = p;
        }
    }

    /**
     * When mouse is dragged, moves a given Shape to new Point
     *
     * @param newPoint the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executeDrag(Point newPoint, Drawing d) {
        if (s != null) {
            s.move(newPoint.x - originPoint.x, newPoint.y - originPoint.y);
            originPoint = newPoint;
        }

    }
}
