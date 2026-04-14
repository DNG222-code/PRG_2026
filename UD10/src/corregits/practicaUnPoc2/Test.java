package corregits.practicaUnPoc2;

import java.util.*;

public class Test<T> {

    public static void main(String[] args) {

        Client[] grupClients = {
                new Client("Joan", 25),
                new Client("Josep", 32),
                new Client("Maria", 28),
                new Client("Ana", 22)
        };

        System.out.println(saludarGrup(grupClients, c -> "Hola " + c.getNom() + "!"));

    }

    static <T> List<String> saludarGrup(T[] grup, Salutacio<T> salutacio) {

        List<String> resultat = new ArrayList<>();

        for (T t : grup) {
            resultat.add(salutacio.saludar(t));
        }

        return resultat;
    }
}
