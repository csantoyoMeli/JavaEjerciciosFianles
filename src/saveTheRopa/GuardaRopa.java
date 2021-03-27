package saveTheRopa;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    private int index;
    private HashMap<Integer, List<Prenda>> diccionario;

    public GuardaRopa() {
        this.index = 0;
        diccionario = new HashMap<>();
    }

    public int guardarPrendas(List<Prenda> listaDePrenda) {
        while(diccionario.containsKey(index)){
            index++;
        }
        diccionario.put(index++, listaDePrenda);
        return index;
    }

    public void mostrarPrendas() {
        for (Integer key: diccionario.keySet()){
            System.out.println("--------------------------");
            System.out.println("Número: " + key);
            for(Prenda p : diccionario.get(key)) {
                System.out.println(p);
            }
            System.out.println("--------------------------");
        }
    }

    public List<Prenda> devolverPrendas(int numero) {
        List prendas = diccionario.get(numero);
        diccionario.remove(numero);
        index = numero;
        return prendas;
    }
}
