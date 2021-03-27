package dakar;

import java.util.ArrayList;

public class Carrera {
    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadVehiculosPermitidos;
    private ArrayList<Vehiculo> listaVehiculos;

    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(double distancia, double premioEnDolares, String nombre, int cantidadVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
        listaVehiculos = new ArrayList<>();
        socorristaAuto = new SocorristaAuto();
        socorristaMoto = new SocorristaMoto();
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        if (listaVehiculos.size() < cantidadVehiculosPermitidos) {
            listaVehiculos.add(new Auto(velocidad, aceleracion, anguloDeGiro, patente));
        } else {
            System.out.println("No se admiten mas vehiculos");
        }
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        if (listaVehiculos.size() < cantidadVehiculosPermitidos) {
            listaVehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
        } else {
            System.out.println("No se admiten mas vehiculos");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (listaVehiculos.remove(vehiculo)) {
            System.out.println("Vehículo eliminado");
        } else {
            System.out.println("No se encontró vehículo");
        }
    }

    public void eliminarVehiculoConPatente(String patente) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().equals(patente)) {
                listaVehiculos.remove(v);
                System.out.println("Vehículo eliminado");
                return;
            }
        }
        System.out.println("No se encontró vehículo");
    }

    public Vehiculo obtenerGanador() {
        double[] performance = new double[listaVehiculos.size()];
        double a = 0;
        int index = 0;
        System.out.println("Listado de peformance: ");
        for (int i = 0; i < performance.length; i++) {
            Vehiculo v = listaVehiculos.get(i);
            performance[i] = (v.getVelocidad() * 0.5 / (v.getAnguloDeGiro() * (v.getPeso() - v.getNumRuedas() * 100)));
            System.out.println("Patente: " + v.getPatente() + " - Performance: " + performance[i]);
            if (a < performance[i]) {
                a = performance[i];
                index = i;
            }
        }
        return listaVehiculos.get(index);
    }

    public void socorrerAuto(String patente) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().equals(patente)) {
                socorristaAuto.socorrer((Auto) v);
                return;
            }
        }
        System.out.println("No se encontró vehículo");
    }

    public void socorrerMoto(String patente) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().equals(patente)) {
                socorristaMoto.socorrer((Moto) v);
                return;
            }
        }
        System.out.println("No se encontró vehículo");
    }

    public void mostrarVehiculos() {
        System.out.println("Lista Vehículos");
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
