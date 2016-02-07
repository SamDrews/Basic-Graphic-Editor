import java.awt.*;
import java.util.ArrayList;

/**
 * Created by samdrews on 1/27/16.
 */

public class Drawing {
    private Color color;
    private ArrayList<Shape> shapeList = new ArrayList<>();

    public Drawing(Color c){
        color = c;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics g){ // iterate through list, from back to front, call given draw method
        for (int i=shapeList.size() - 1; i > 0; i--) {
            Shape currentShape = shapeList.get(i);
            currentShape.draw(g);
        }
    }

    /**
     * Given a Point p, returns the frontmost Shape in the Drawing
     */
    public Shape getFrontmostContainer(Point p){
        for (Shape givenShape : shapeList) {
            if (givenShape.containsPoint(p)) {
                return givenShape;
            }
        }
        return null;
    }

    public void createWhileDrag(Shape s) {
        //shapeList.remove(0);
        makeShape(s);
    }

    public void makeShape(Shape s) {
        shapeList.add(s);
    }
}
