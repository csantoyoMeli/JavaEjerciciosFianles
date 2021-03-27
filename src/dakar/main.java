package dakar;

public class main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(70.98, 100.5,"Dakar" , 5);

        carrera.darDeAltaAuto(60.5,7.2,Math.PI/4, "MLA596");
        carrera.darDeAltaAuto(75.5,2.8,Math.PI/3, "DCA543");
        carrera.darDeAltaMoto(80.5,5.4,Math.PI/4, "DC4543");
        carrera.darDeAltaMoto(54.5,3.7,Math.PI/8, "OT8513");
        carrera.darDeAltaMoto(90.1,1.5,2*Math.PI/3, "DW3243");
        carrera.mostrarVehiculos();

        carrera.eliminarVehiculo(carrera.getListaVehiculos().get(2));
        carrera.eliminarVehiculoConPatente("DCA5423");

        carrera.eliminarVehiculo(new Auto(90.1,1.5,2*Math.PI/3, "DW3243"));
        carrera.eliminarVehiculoConPatente("DW3243");

        carrera.mostrarVehiculos();

        carrera.socorrerAuto("MLA596");
        carrera.socorrerAuto("123");
        carrera.socorrerMoto("DW3243");
        carrera.socorrerMoto("123");

        System.out.println("El ganador de la carrera es: " + carrera.obtenerGanador());
    }
}
