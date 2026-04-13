package apunts.deZero;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Client c1 = new Client("Joan", 25, 60.0);
        Client c2 = new Client("David", 20, 55.0);
        Client c3 = new Client("Ana", 25, 87.9);
        Client c4 = new Client("Maria", 30, 76.0);
        Client c5 = new Client("Juan", 25, 45.6);

        List<Client> llistaClients = new ArrayList<>();

        llistaClients.add(c1);
        llistaClients.add(c2);
        llistaClients.add(c3);
        llistaClients.add(c4);
        llistaClients.add(c5);

//        Comparator<Client> compNom = new Comparator<Client>() {
//            @Override
//            public int compare(Client o1, Client o2) {
//                return o1.getNom().compareTo(o2.getNom());
//            }
//        };

//        Comparator<Client> compNom = new ComparaNoms();
//        Collections.sort(llistaClients, /* Collections.reverseOrder( */new ComparaNoms());

//        Collections.sort(llistaClients, new Comparator<Client>() {
//            @Override
//            public int compare(Client o1, Client o2) {
//                return o1.getNom().compareTo(o2.getNom());
//            }
//        });

//        Comparator<Client> comp =
//                (o1, o2) -> o1.getNom().compareTo(o2.getNom());
//
//        Collections.sort(llistaClients, (o1, o2) -> o1.getNom().compareTo(o2.getNom()));

//        Collections.sort(llistaClients, (o1, o2) -> o1.getEdat() - o2.getEdat());

//        System.out.println(llistaClients);

        Collections.sort(llistaClients, (o1, o2) -> (int) (o1.getPes() - o2.getPes()));

        for (Client c : llistaClients) {
            System.out.print(c);
        }

    }
}
