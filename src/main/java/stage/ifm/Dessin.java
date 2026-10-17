package stage.ifm;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dessin implements Serializable {
    private List<Figure> figures;

    private AlgoStrategy algoStrategy;
    public Dessin() {
        this.figures = new ArrayList<>();
    }
    public void ajouterFigure(Figure f) {
        figures.add(f);
    }
    public void supprimerFigure(Figure f) {
        figures.remove(f);
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setAlgoStrategy(AlgoStrategy algoStrategy) {
        this.algoStrategy = algoStrategy;
    }

    public AlgoStrategy getAlgoStrategy() {
        return algoStrategy;
    }

    public void AfficheFigures() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
    public void SerialiserDessin() {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new FileOutputStream("dessin.bin"))) {

            out.writeObject(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
