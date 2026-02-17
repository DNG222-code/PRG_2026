package corregits.practica2;

import java.util.*;

public class UtilidadesScanner {

    public static String ObtenerAtributoCadena(String atributo) {
        Scanner sc = new Scanner(System.in);

        String valor = "";
        int contador = 0;

        while ((contador < 3) && (valor == null || valor.trim().length() == 0)) {
            try {
                System.out.println("Introduzca un valor para \"" + atributo + "\": ");
                valor = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                contador++;
            }
        }

        return valor == null || valor.trim().length() == 0 ?
                "No tiene " + atributo : valor;
    }
}
