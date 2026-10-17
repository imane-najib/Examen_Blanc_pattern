package stage.ifm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dessin d = new Dessin();
        d.setAlgoStrategy(new AlgoStrategyImpl1());
        d.getAlgoStrategy().traiter(d);
    }
}