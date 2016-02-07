import java.awt.*;
import java.util.ArrayList;

/**
 * Created by samdrews on 1/27/16.
 */

public class Drawing {
    private Color color;
    private ArrayList shapeList = new ArrayList();

    public Drawing(Color c){
        color = c;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics g){ // iterate through list, from back to front, call given draw method
        for (int i=shapeList.size(); i > 0; i--) {
            Shape currentShape = new Shape() {
            }
            .draw(g);shapeList.get(i);
        }
    }

    public Shape getFrontmostContainer(Point p){
        // Fill IN
        return null;
    }


}
