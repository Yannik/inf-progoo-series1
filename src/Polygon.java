import acm.graphics.GLine;
import acm.program.*;

public class Polygon extends GraphicsProgram{
    public void run() {
        //int sides = readInt("Kanten: ");
        int sides = 4;
        println("Generiere Polygon mit " + sides + " Kanten.");
        double totalDegrees = 360;
        double degreesPerSide = totalDegrees / sides;
        for (int side = 0; side < sides; side++) {
            double startDegree = degreesPerSide * side;
            double endDegree = degreesPerSide * (side + 1);
            int xOffset = 0;
            int yOffset = 0;
            double x0 = Math.cos(startDegree) * 100 + xOffset;
            double y0 = Math.sin(startDegree) * 100 + yOffset;
            double x1 = Math.cos(endDegree) * 100 + xOffset;
            double y1 = Math.sin(endDegree) * 100 + yOffset;
            add(new GLine(x0, y0, x1, y1));
            println("Degree: " + startDegree + " endDegree: " + endDegree + " x0: " + x0 + " y0: " + y0 + " x1: " + x1 + " y1: " + y1);
        }
    }
    public static void main(String[] args) {
        new Polygon().start(args);
    }
}
