import java.awt.*;

/**
 * EllipseCmd.java
 * Command class to perform a ellipse command.
 *
 * @author Samson Drews
 * @see Command
 */
public class EllipseCmd extends Command {
    private Color color;
    private double myX, myY, width, height;


    public void executePress(Point p, Drawing d) {
        myX = p.x;
        myY = p.y;
        width = 0;
        height = 0;
        color = d.getColor();

        d.makeShape(new Ellipse(color, p));
    }


    public void executeDrag(Point p, Drawing d) {
        width = Math.abs(p.x - myX);
        height = Math.abs(p.y - myY);

        Point origPoint = new Point((int)Math.min(p.x, myX), (int)Math.min(p.y, myY));
        Ellipse newEllip = new Ellipse(color, origPoint);

        newEllip.setHeight(height);
        newEllip.setWidth(width);

        d.createWhileDrag(newEllip);
    }
}

