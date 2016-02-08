import java.awt.*;

/**
 * ColorCmd.java
 * Command class to perform a color command.
 *
 * @author Samson Drews
 * @see Command
 */

public class ColorCmd extends Command {
    private Color color;

    /**
     * On a mouse click, sets the color of a given Shape
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executeClick(Point p, Drawing d) {
        color = d.getColor();
        Shape selectedShape = d.getFrontmostContainer(p);
        selectedShape.setColor(color);
    }
}
