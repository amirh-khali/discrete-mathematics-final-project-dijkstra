import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Edges extends Line {

    private int weight;
    private Nodes start;
    private Nodes end;
    private boolean mark = false;

    private Text valueFace;

    private Arrow myFace;

    public Edges (Nodes start, Nodes end, int value) {

        myFace = new Arrow();

        valueFace = new Text(Integer.toString(value));
        valueFace.setStroke(Color.WHITE);
        valueFace.setFill(Color.WHITE);

        // 	73, 157, 238

        this.start = start;
        this.end = end;
        weight = value;

        myFace.setStartX(start.getFace().getCenterX());
        myFace.setStartY(start.getFace().getCenterY());
        myFace.setEndX(end.getFace().getCenterX());
        myFace.setEndY(end.getFace().getCenterY());

        valueFace.setX( ( myFace.getStartX() + myFace.getEndX() ) / 2);
        valueFace.setY( ( myFace.getStartY() + myFace.getEndY() ) / 2);

    }

    public Arrow getFace () {
        return myFace;
    }

    public Text getValFace () {
        return valueFace;
    }

    public int getVal () { return weight; }

    public Nodes getFirstNode () { return start; }

    public Nodes getSecondNode () { return end; }

}
