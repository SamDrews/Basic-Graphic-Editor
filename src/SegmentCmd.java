import java.awt.*;

/**
 * SegmentCmd.java
 * Command class to perform a segment command.
 *
 * @author Samson Drews
 * @see Command
 */

public class SegmentCmd extends Command{
    private Color color;
    private double initX, initY;


    public void executePress(Point p, Drawing d) {
        initX = p.x;
        initY = p.y;
        color = d.getColor();

        d.makeShape(new Segment(color, p, p));
    }


    public void executeDrag(Point p, Drawing d) {
        Point initP = new Point((int)(initX), (int)(initY));

        Segment newSeg = new Segment(color, initP, p);

        d.createWhileDrag(newSeg);
    }
}
