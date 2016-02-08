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

    /**
     * On a mouse press, sets x and y coordinates and color
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executePress(Point p, Drawing d) {
        initX = p.x;
        initY = p.y;
        color = d.getColor();

        d.makeShape(new Segment(color, p, p));
    }

    /**
     * When mouse is dragged, draws a Segment on canvas and
     *  when released will add a Segment to the canvas
     *
     * @param p the Point where the mouse is clicked
     * @param d the Drawing to draw to the canvas
     */
    public void executeDrag(Point p, Drawing d) {
        Point initP = new Point((int)(initX), (int)(initY));

        Segment newSeg = new Segment(color, initP, p);

        d.createWhileDrag(newSeg);
    }
}
