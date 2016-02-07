import java.awt.*;

/**
 * Created by samdrews on 2/7/16.
 */

public class ColorCmd {
    private Color color;

    public void executeClick(Point p, Drawing d) {
        Shape selectedShape = d.getFrontmostContainer(p);
        selectedShape.setColor(color);
    }
}
