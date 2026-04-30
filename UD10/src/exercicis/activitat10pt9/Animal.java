package exercicis.activitat10pt9;

import java.io.*;
import java.util.*;

public class Animal implements Serializable {

    // Atributos.
    private String nombre;
    private Especie especie;
    private int edad;
    private double precio;

    public static void menu() {
        int opcion = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print( """
                        ====================
                                MENÚ
                        ====================
                    
                        (1) - Listar animales.
                        (2) - Filtrar animales por domesticidad de su especie.
                        (3) - Obtener lista de nombres de animales.
                        (4) - Mostrar animales ordenados por precio.
                        (5) - Añadir nuevo animal.
                        (6) - Eliminar animales mayores de cierta edad.
                        (7) - Editar precio de un animal.
                        (8) - Gestión de especies.
                        (0) - Salir y guardar.
                    """ + "\n");

            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Guardando datos... Gracias por usar el programa.");
            } else if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {

            } else if (opcion == 7) {

            } else if (opcion == 8) {
                System.out.print("""
                            ================
                                SUBMENÚ
                            ================
                        
                            (1) - Listar especies.
                            (2) - Añadir especie.
                            (3) - Editar especie existente.
                            (4) - Eliminar especie (si no está en uso).
                            (0) - Volver al menú principal.
                        """ + "\n");

                if (opcion == 0) {
                    System.out.println("Vuelves al menú principal.");
                } else if (opcion == 1) {

                } else if (opcion == 2) {

                } else if (opcion == 3) {
                    System.out.println("Especie editada con éxito.");
                } else if (opcion == 4) {
                    System.out.println("Especie eliminada con éxito.");
                }
            }

        } while (opcion != 0);

    }
}