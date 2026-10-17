package stage.ifm;

import java.util.List;

public class AlgoStrategyImpl1 implements AlgoStrategy {
    @Override
    public void traiter(Dessin dessin) {
        System.out.println("AlgoStrategyImpl1");
        double TotalSur = 0;
        for (Figure figure : dessin.getFigures()) {
            TotalSur+= figure.surface();
        }
        System.out.println("TotalSur = " + TotalSur);
    }
}
