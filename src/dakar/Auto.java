package dakar;

public class Auto extends Vehiculo {
    public Auto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente);
        this.setPeso(1000);
        this.setNumRuedas(4);
    }

    @Override
    public String toString() {
        return "Auto) Patente: " + this.getPatente()
                + " | Peso: " + this.getPeso()
                + " | NumRuedas: " + this.getNumRuedas()
                + " | Velocidad: " + this.getVelocidad()
                + " | Aceleración: " + this.getAceleracion()
                + " | Ángulo de giro: " + this.getAnguloDeGiro();

    }
}
