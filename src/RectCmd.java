import java.awt.*;

/**
 * Created by samdrews on 2/6/16.
 */
public class RectCmd extends Command {
    private Color color; // Rect's color
    private int myX, myY, width, height; // Rect's width, height, and x and y coordinates
    private Rectangle currentRect = null;

    public void executePress(Point p, Drawing dwg) {
        myX = p.x;
        myY = p.y;
        width = 0;
        height = 0;
        color = dwg.getColor();
        currentRect = new Rectangle(color, p);
    }

    public void executeDrag(Point p, Drawing dwg) {
        if (currentRect != null) {

        }
    }
}
