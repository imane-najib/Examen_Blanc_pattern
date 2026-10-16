package stage.ifm;

import java.awt.*;

public class cercle extends Figure{
    private point centre;
    private double rayon;
    @Override
    public double perimete() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public double surface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }
    @Override
    public void dessiner() {
        System.out.println("Cercle :");
        System.out.println("Centre X : " + this.centre.getX()+" Y :" + this.centre.getY());
        System.out.println("Rayon : " + this.rayon);
        System.out.println("Périmètre : " + perimete());
        System.out.println("Surface : " + surface());
    }
}
