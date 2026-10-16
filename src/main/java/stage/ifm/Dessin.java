package stage.ifm;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> figures;
    public Dessin() {
        this.figures = new ArrayList<>();
    }
    public void ajouterFigure(Figure f) {
        figures.add(f);
    }
    public void supprimerFigure(Figure f) {
        figures.remove(f);
    }
}
