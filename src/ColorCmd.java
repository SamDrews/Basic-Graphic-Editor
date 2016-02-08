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

    public void executeClick(Point p, Drawing d) {
        color = d.getColor();
        Shape selectedShape = d.getFrontmostContainer(p);
        selectedShape.setColor(color);
    }
}
