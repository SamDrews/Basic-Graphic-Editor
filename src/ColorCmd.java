import java.awt.*;

/**
 * Created by samdrews on 2/7/16.
 */

public class ColorCmd extends Command {
    private Color color;

    public void executeClick(Point p, Drawing d) {
        Color currentColor = d.getColor();
        Shape selectedShape = d.getFrontmostContainer(p);
        selectedShape.setColor(color);
    }
}
