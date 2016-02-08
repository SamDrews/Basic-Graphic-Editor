import java.awt.*;

/**
 * Created by samdrews on 2/7/16.
 */

public class SegmentCmd extends Command{
    private Color color;
    private double initX, finalX, initY, finalY;
    //private Point finalP;


    public void executePress(Point p, Drawing d) {
        initX = p.x;
        initY = p.y;
        color = d.getColor();

        d.makeShape(new Segment(color, p, p));
    }


    public void executeDrag(Point p, Drawing d) {
        Point initP = new Point((int)initX, (int)initY);
        Segment newSeg = new Segment(color, initP, p);

        d.createWhileDrag(newSeg);
    }
}
