import java.awt.*;

/**
 * Created by samdrews on 1/27/16.
 */
public class Rectangle extends Shape {
    /**
     * Create a Shape, setting its color.
     *
     * @param c the color you wish the shape to initially have
     */
    public Rectangle(Color c) {
        super(c);
    }

    @Override
    public void drawShape(Graphics page) {

    }

    @Override
    public boolean containsPoint(Point p) {
        return false;
    }

    @Override
    public void move(int deltaX, int deltaY) {

    }

    @Override
    public Point getCenter() {
        return null;
    }
}
