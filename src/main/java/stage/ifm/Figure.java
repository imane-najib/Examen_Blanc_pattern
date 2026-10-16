package stage.ifm;

public abstract class Figure {
    private int epaisseur;
    private int couleurC;
    private int couleurR;
    public abstract double perimete();
    public abstract double surface();
    public abstract void dessiner();
}
