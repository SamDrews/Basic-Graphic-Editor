import java.awt.*;

/**
 * Created by samdrews on 2/7/16.
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
