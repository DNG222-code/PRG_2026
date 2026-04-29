package exercicis.activitat10pt8;

import java.util.*;
import java.util.Map.*;

public class Test {

    public static void main(String[] args) {

        // Array de clientes.
        Client[] clients = {
                new Client("Pere", "28/04/2015", "46746764A"),
                new Client("Juan", "13/02/2005", "46746764B"),
                new Client("Adri", "14/01/2006", "46746764C"),
        };

        // Creamos un map.
        Map<String, String> mapClients = new HashMap<>();

        // Añadimos los clientes al map.
        // La clave será el DNI del cliente.
        for (Client c : clients) {
            mapClients.put(c.getDNI(), c.getNom());
        }

        // Mostrar la clave del DNI y el valor correspondiente de la clase DadesClient.
        for (Entry<String, String> clientEntry : mapClients.entrySet()) {
            System.out.println("DNI: " + clientEntry.getKey() + " , Nombre: " + clientEntry.getValue());
        }

    }

}
