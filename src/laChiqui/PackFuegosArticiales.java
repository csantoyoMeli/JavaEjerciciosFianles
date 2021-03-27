package laChiqui;

import java.util.ArrayList;
import java.util.List;

public class PackFuegosArticiales implements Reventable {
    private List<Reventable> pfa; // Pack Fuegos Artificiales

    public PackFuegosArticiales() {
        this.pfa = new ArrayList<>();
    }

    public void añadirReventable(Reventable r) {
        pfa.add(r);
    }

    @Override
    public void reventar() {
        System.out.println("Se detona un pack de FFAA");
        for (int i = 0; i < pfa.size() ; i++) {
            pfa.get(i).reventar();
        }
    }
}
