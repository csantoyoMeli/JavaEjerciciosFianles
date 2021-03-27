package saveTheRopa;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        GuardaRopa gr = new GuardaRopa();

        Prenda p1 = new Prenda("Adidas", "1990");
        Prenda p2 = new Prenda("Nike", "2017");
        ArrayList<Prenda> listaPrenda1 = new ArrayList<>();
        listaPrenda1.add(p1);
        listaPrenda1.add(p2);
        gr.guardarPrendas(listaPrenda1);

        Prenda p3 = new Prenda("Adidas", "2019");
        Prenda p4 = new Prenda("Under Armor", "2010");
        Prenda p5 = new Prenda("Lotto", "2001");
        ArrayList<Prenda> listaPrenda2 = new ArrayList<>();
        listaPrenda2.add(p3);
        listaPrenda2.add(p4);
        listaPrenda2.add(p5);
        gr.guardarPrendas(listaPrenda2);
        gr.mostrarPrendas();

        gr.devolverPrendas(0);
        System.out.println("LUEGO DE SACAR LAS PRIMERAS ROPAS");
        gr.guardarPrendas(listaPrenda2);
        gr.guardarPrendas(listaPrenda1);
        gr.mostrarPrendas();
    }
}
