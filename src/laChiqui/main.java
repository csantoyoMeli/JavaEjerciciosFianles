package laChiqui;

public class main {
    public static void main(String[] args) {
        FiestaChiqui fChiqui = new FiestaChiqui();
        Invitado is = new InvitadoStandard();
        Invitado im = new InvitadoMeli();

        // Armamos los invitados
        fChiqui.añadirInvitado(is);
        fChiqui.añadirInvitado(im);
        fChiqui.añadirInvitado(is);
        fChiqui.añadirInvitado(is);
        fChiqui.añadirInvitado(im);

        // Armamos los fuegos artificiales
        PackFuegosArticiales pfArtificales = new PackFuegosArticiales();
        FuegoArtificial fArtificial = new FuegoArtificial();

        pfArtificales.añadirReventable(fArtificial);
        pfArtificales.añadirReventable(fArtificial);

        fChiqui.añadirFuegoArtifical(fArtificial);
        fChiqui.añadirFuegoArtifical(fArtificial);
        fChiqui.añadirFuegoArtifical(fArtificial);
        fChiqui.añadirFuegoArtifical(pfArtificales);

        // Se pone buena la fiesta!!

        fChiqui.reventarFA();
        fChiqui.servirTortaMGDM();
    }
}
