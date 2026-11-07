package stage.ifm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        cercle c1 = new cercle(new point(2, 3), 5);
        rectangle r1 = new rectangle(new point(0, 0), 10, 5);
        cercle c2 = new cercle(new point(4, 4), 3);

        GroupeFigure groupe1 = new GroupeFigure();
        groupe1.ajouterFigure(c1);
        groupe1.ajouterFigure(r1);

        GroupeFigure groupe2 = new GroupeFigure();
        groupe2.ajouterFigure(groupe1);
        groupe2.ajouterFigure(c2);

        Dessin dessin = new Dessin();
        dessin.ajouterFigure(groupe2);
        System.out.println("===== AFFICHAGE DES FIGURES =====");
        dessin.AfficheFigures();

        System.out.println("\n===== STRATEGIE 1 : SURFACES =====");
        dessin.setAlgoStrategy(new AlgoStrategyImpl1());
        dessin.getAlgoStrategy().traiter(dessin);

        System.out.println("\n===== STRATEGIE 2 : PERIMETRES =====");
        dessin.setAlgoStrategy(new AlgoStrategyImpl2());
        dessin.getAlgoStrategy().traiter(dessin);


        System.out.println("\n===== PATTERN OBSERVER =====");
        Parametrage parametrage = new Parametrage();
        parametrage.addObserver(groupe2);
        parametrage.setParametrage(5, 1, 2);

        System.out.println("\n===== SERIALISATION =====");

        dessin.SerialiserDessin();

        System.out.println("Dessin sérialisé avec succès !");


        System.out.println("\n===== SUPPRESSION =====");

        groupe2.supprimerFigure(c2);

        dessin.AfficheFigures();
    }
}