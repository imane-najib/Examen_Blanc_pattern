package stage.ifm;

import java.io.Serializable;

public abstract class Figure implements Observer, Serializable {
    private int epaisseur;
    private int couleurC;
    private int couleurR;
    public abstract double perimete();
    public abstract double surface();
    public abstract void dessiner();
    @Override
    public void update(Parametrage parametrage) {
        this.epaisseur = parametrage.getEpaisseur();
        this.couleurC = parametrage.getCouleurC();
        this.couleurR = parametrage.getCouleurR();
    }

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
