package stage.ifm;

import java.io.Serializable;

public interface AlgoStrategy extends Serializable {
    void traiter(Dessin dessin);
}
