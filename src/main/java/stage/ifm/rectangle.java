package stage.ifm;

public class rectangle extends Figure{
    private point coin_sup;
    private double largeur;
    private double hauteur;

    public rectangle(point coin_sup, double largeur, double hauteur) {
        this.coin_sup = coin_sup;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double perimete() {
        return 2 * (largeur + hauteur);
    }

    @Override
    public double surface() {
        return this.largeur * this.hauteur;
    }

    @Override
    public void dessiner() {
        System.out.println("Rectangle :");
        System.out.println("Largeur : " + largeur);
        System.out.println("Hauteur : " + hauteur);
        System.out.println("Périmètre : " + perimete());
        System.out.println("Surface : " + surface());
    }


}
