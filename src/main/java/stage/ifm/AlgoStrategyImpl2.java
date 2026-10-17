package stage.ifm;

public class AlgoStrategyImpl2 implements AlgoStrategy {
    @Override
    public void traiter(Dessin dessin) {
        System.out.println("AlgoStrategyImpl2");
        double TotalP = 0;
        for (Figure figure : dessin.getFigures()) {
            TotalP+= figure.perimete();
        }
        System.out.println("TotalP = " + TotalP);
    }
}
