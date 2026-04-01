package apunts;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<Client> llista = new ArrayList<>();

        llista.add(new Client("Joan"));
        llista.add(new Client("David"));
        llista.add(new Client("Emilio"));

        // STREAM

        // Primera Forma
        // Comparator<Client> comp = new ComparaNoms();
        // Collections.sort(llista, comp);

//        Collections.sort(llista, new ComparaNoms());

        // Segona Forma
//        Comparator<Client> comp = new Comparator<Client>() {
//            @Override
//            public int compare(Client o1, Client o2) {
//                return o1.getNom().compareTo(o2.getNom());
//            }
//        };
//
//        Collections.sort(llista, comp);

//        Collections.sort(llista, new Comparator<Client>() {
//            @Override
//            public int compare(Client o1, Client o2) {
//                return o1.getNom().compareTo(o2.getNom());
//            }
//        });

//        // Tercera Forma - Expressions LAMBDA - Funcions Flecha
//        Comparator<Client> comp =
//                (Client o1, Client o2) -> {return o1.getNom().compareTo(o2.getNom());};

//        Comparator<Client> comp =
//                (o1,  o2) -> {return o1.getNom().compareTo(o2.getNom());};

//        Comparator<Client> comp =
//                (o1,  o2) -> o1.getNom().compareTo(o2.getNom());
//
//        Collections.sort(llista, comp);

        Collections.sort(llista,
                    (o1,  o2) -> o1.getNom().compareTo(o2.getNom()));

    }
}
