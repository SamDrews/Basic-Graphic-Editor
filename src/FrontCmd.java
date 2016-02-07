import java.awt.*;

/**
 * Created by samdrews on 2/7/16.
 */

public class FrontCmd extends Command {
    private Shape s;

    public void executeClick(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);

        if (s != null) {
            d.toFront(s);
        }
    }
}
