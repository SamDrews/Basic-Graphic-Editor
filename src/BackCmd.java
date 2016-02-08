import java.awt.*;

/**
 * BackCmd.java
 * Command class to perform a back command.
 *
 * @author Samson Drews
 * @see Command
 */
public class BackCmd extends Command {
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
            d.toBack(s);
        }
    }
}
