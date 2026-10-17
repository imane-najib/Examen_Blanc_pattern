package stage.ifm;

import java.io.Serializable;

public class point implements Serializable {
    private double x;
    private double y;
    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {this.y = y;}
}
