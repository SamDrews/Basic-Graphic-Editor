import java.awt.*;

/**
 * FrontCmd.java
 * Command class to bring perform a front command.
 *
 * @author Samson Drews
 * @see Command
 */

public class FrontCmd extends Command {
    private Shape s;

    /**
     * On a mouse click, sets a given Shape to front of canvas
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executeClick(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);

        if (s != null) {
            d.toFront(s);
        }
    }
}
