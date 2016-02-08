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

    public void executeClick(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);

        if (s != null) {
            d.toBack(s);
        }
    }
}
