package stage.ifm;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigure extends Figure{
    private List<Figure> figures;

    public GroupeFigure() {
        this.figures = new ArrayList<>();
    }

    @Override
    public double perimete() {
        double perimeteT = 0;
        for(Figure figure : figures){
            perimeteT += figure.perimete();
        }
        return perimeteT;
    }

    @Override
    public double surface() {
        double surfaceT = 0;
        for(Figure figure : figures){
            surfaceT += figure.surface();
        }
        return surfaceT;
    }

    @Override
    public void dessiner() {
        for(Figure figure : figures){
            figure.dessiner();
        }
    }

    @Override
    public void update() {
        for(Figure figure : figures){
            figure.update();
        }
    }

    public void ajouterFigure(Figure f) {
        figures.add(f);
    }

    public void supprimerFigure(Figure f) {
        figures.remove(f);
    }
}
