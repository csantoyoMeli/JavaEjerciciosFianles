package dakar;

public class Moto extends Vehiculo {
    public Moto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente);
        this.setPeso(300);
        this.setNumRuedas(2);
    }

    @Override
    public String toString() {
        return "Moto) Patente: " + this.getPatente()
                + " | Peso: " + this.getPeso()
                + " | NumRuedas: " + this.getNumRuedas()
                + " | Velocidad: " + this.getVelocidad()
                + " | Aceleración: " + this.getAceleracion()
                + " | Ángulo de giro: " + this.getAnguloDeGiro();

    }
}
