package laChiqui;

import java.util.ArrayList;
import java.util.List;

public class FiestaChiqui {
    private List<Invitado> lInvitados;
    private PackFuegosArticiales packPrincipal;

    public FiestaChiqui() {
        lInvitados = new ArrayList<>();
        packPrincipal = new PackFuegosArticiales();
    }

    public void añadirInvitado(Invitado invitado) {
        lInvitados.add(invitado);
    }

    public void añadirFuegoArtifical(Reventable r) {
        packPrincipal.añadirReventable(r);
    }

    public void reventarFA() {
        packPrincipal.reventar();
    }

    public void servirTortaMGDM() {
        System.out.println("** Sirviendo la torta más grande del mundo **");
        System.out.println(" < < < 3 Doritos después < < <");
        for (Invitado i: lInvitados) {
            i.comerTorta();
        }
    }
}
