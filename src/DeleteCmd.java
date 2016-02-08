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

    public void executeClick(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);
        if (s != null) {
            d.removeShape(s);
        }
    }
}
