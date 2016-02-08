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

    /**
     * Create a Drawing, setting its color
     *
     * @param c the color the Drawing initially has
     */
    public Drawing(Color c){
        color = c;
    }

    /**
     * Gets the color of a Drawing
     *
     * @param
     */
    public Color getColor() {
        return color;
    }

    /**
     * Draws a Shape on the canvas
     *
     * @param g the canvas where to draw
     */
    public void draw(Graphics g){ // iterate through list, from back to front, call given draw method
        for (int i=shapeList.size() - 1; i >= 0; i--) {
            Shape currentShape = shapeList.get(i);
            currentShape.draw(g);
        }
    }

    /**
     * Given a Point p, returns the front most Shape in the Drawing
     *
     * @return givenShape the front most Shape
     */
    public Shape getFrontmostContainer(Point p){
        for (Shape givenShape : shapeList) {
            if (givenShape.containsPoint(p)) {
                return givenShape;
            }
        }
        return null;
    }

    /**
     * When mouse is dragged, creates and removes until user done
     *  dragging, to avoid painting
     *
     * @param s the given Shape
     */
    public void createWhileDrag(Shape s) {
        shapeList.remove(0);
        makeShape(s);
    }

    /**
     * Adds a Shape to the front most spot in the Array
     *
     * @param s the given Shape
     */
    public void makeShape(Shape s) {
        shapeList.add(0, s);
    }

    /**
     * Sets the color of a Shape
     *
     * @param c the desired color
     */
    public void setColor(Color c) {
        color = c;
    }

    /**
     * Removes a given Shape from the Array
     *
     * @param s the Shape to remove
     */
    public void removeShape(Shape s) {
        shapeList.remove(s);
    }

    /**
     * Brings a given Shape to the front of the Array
     *
     * @param s the Shape to bring to front
     */
    public void toFront(Shape s) {
        shapeList.remove(s);
        makeShape(s);
    }

    /**
     * Brings a given Shape to the back of the Array
     *
     * @param s the Shape to bring to back
     */
    public void toBack(Shape s) {
        shapeList.remove(s);
        shapeList.add(shapeList.size(), s);
    }
}
