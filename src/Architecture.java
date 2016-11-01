import acm.graphics.*;
import acm.program.*;

public class Architecture extends GraphicsProgram {
    public void run() {
        add(new GPolygon(new GPoint[]{new GPoint(100, 100), new GPoint(150, 50), new GPoint(200, 100)})); //roof
        add(new GRect(100, 100, 100, 100)); // house body
        add(new GRect(110, 110, 80, 35)); // big window
        add(new GRect(110, 155, 40, 20)); // small window
        add(new GRect(160, 155, 30, 40)); // door
        add(new GOval(165, 175, 3, 3)); // door knob
    }
    public static void main(String[] args) {
        new Architecture().start(args);
    }
}