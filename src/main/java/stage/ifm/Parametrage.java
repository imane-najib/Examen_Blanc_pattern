package stage.ifm;

import java.util.ArrayList;
import java.util.List;

public class Parametrage {

    private int epaisseur;
    private int couleurC;
    private int couleurR;

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void setParametrage(int epaisseur, int couleurC, int couleurR) {
        this.epaisseur = epaisseur;
        this.couleurC = couleurC;
        this.couleurR = couleurR;

        notifyObservers();
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