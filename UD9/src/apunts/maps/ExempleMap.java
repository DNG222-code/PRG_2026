package apunts.maps;

import java.util.*;

public class ExempleMap {

    public static void main(String[] args) {

        // Creem un map (clau --> valor)
        Map<String, String> map = new HashMap<>();

        // Métodes
        // put(clau, valor) Anar afegint elements
        map.put("111", "Anna");
        map.put("112", "Marc");
        map.put("113", "Laura");
        map.put("114", "Joan"); // mateixa clau (subtitueix el valor)

        System.out.println("Map: " + map);

        // get() retorna el valor de la clau
        System.out.println("Clau 111: " + map.get("111"));

        // containsKey ContainsValor (comprova si existeix clau o el valor)
        System.out.println("Conté la clau 112? " + map.containsKey("112"));
        System.out.println("Conté el valor Anna? " + map.containsValue("Anna"));

        // remove() elimina el valor de la clau
        System.out.println("Eliminem el valor de la clau 112: " + map.remove("112"));
        System.out.println("Map: " + map);

        // Visites a map
        // keySet ens retorna totes les claus del mapa
        System.out.println("\nClaus: " );
        for (String key : map.keySet()) {
            System.out.print(key);
        }

        // values ens retorna tots els valors del mapa
        System.out.println("\nValors: " );
        for (String valor : map.values()) {
            System.out.print(valor);
        }

        // entrySet: clau + valor
        System.out.println("\nEntrades: ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Modifiquem un valor
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (e.getKey().equals("112")) {
                e.setValue("Maria");
            }
        }

        System.out.println("Després de modificar: " + map);

        // Diferents implementacions
        Map<String, String> hashMap = new HashMap<>(); // sense ordre
        Map<String, String> linkedMap = new LinkedHashMap<>(); // ordre insercció
        Map<String, String> treeMap = new TreeMap<>(); // ordenat
    }
}
