import java.awt.*;

/**
 * MoveCmd.java
 * Command class to perform a move command.
 *
 * @author Samson Drews
 * @see Command
 */

public class MoveCmd extends Command {
    private Shape s;
    private Point originPoint;


    public void executePress(Point p, Drawing d) {
        s = d.getFrontmostContainer(p);
        if (s != null) {
            originPoint = p;
        }
    }

    public void executeDrag(Point newPoint, Drawing d) {
        if (s != null) {
            s.move(newPoint.x - originPoint.x, newPoint.y - originPoint.y);
            originPoint = newPoint;
        }

    }
}
