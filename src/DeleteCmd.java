import java.awt.*;

/**
 * DeleteCmd.java
 * Command class to perform a delete command.
 *
 * @author Samson Drews
 * @see Command
 */

public class DeleteCmd extends Command {
    private Shape s;

    /**
     * On a mouse click, sets a given Shape to back of canvas
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executeClick(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);
        if (s != null) {
            d.removeShape(s);
        }
    }
}
