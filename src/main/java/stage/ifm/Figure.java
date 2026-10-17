package stage.ifm;

import java.io.Serializable;

public abstract class Figure implements Observer, Serializable {
    private int epaisseur;
    private int couleurC;
    private int couleurR;
    public abstract double perimete();
    public abstract double surface();
    public abstract void dessiner();
    public abstract void update();

    public int getEpaisseur() {
        return epaisseur;
    }

    public int getCouleurC() {
        return couleurC;
    }

    public int getCouleurR() {
        return couleurR;
    }
}
