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

    public void executeClick(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);

        if (s != null) {
            d.toFront(s);
        }
    }
}
