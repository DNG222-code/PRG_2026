package correciones.colecciones.exercici31;

import java.util.*;

public class Exercici31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Map (clau= nombre, valor= vegades)
        Map<Integer, Integer> map = new HashMap<>();

        int n;

        System.out.println("Introdueix nombres (fins 0): ");

        do {
            n = sc.nextInt();
            if (n != 0) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        } while (n != 0);

        // Mostrem el map complet
        System.out.println("Comptador: " + map);

        int maxNum = 0;
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                maxNum = e.getKey();
            }
        }

        System.out.println("Més repetit: " + maxNum);
        sc.close();

    }
}
