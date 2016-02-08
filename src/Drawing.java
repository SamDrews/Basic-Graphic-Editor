import java.awt.*;
import java.util.ArrayList;

/**
 * Drawing.java
 * Class to draw on canvas (place Shape objects in the array)
 *
 * @author Samson Drews
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
        for (int i=shapeList.size() - 1; i >= 0; i--) {
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
        shapeList.remove(0);
        makeShape(s);
    }

    public void makeShape(Shape s) {
        shapeList.add(0, s);
    }

    public void setColor(Color c) {
        color = c;
    }

    public void removeShape(Shape s) {
        shapeList.remove(s);
    }

    public void toFront(Shape s) {
        shapeList.remove(s);
        makeShape(s);
    }

    public void toBack(Shape s) {
        shapeList.remove(s);
        shapeList.add(shapeList.size(), s);
    }
}
