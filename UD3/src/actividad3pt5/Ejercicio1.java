package actividad3pt5;

// Importamos todas la librerías.
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Declaramos las variables, icluido el Scanner y las variables para hacer los calculos..
        Scanner sc = new Scanner(System.in);
        double ladoCorto;
        double ladoLado;
        double area;
        double zonaEdificable;
        double zonaAjardinada;
        double precioFinalEdificable;
        double precioFinalAjardinada;
        double precioTotal;
        double incremento;

        // Pedimos al usuario los lados en metros.
        System.out.println("Introduzca el lado corto en metros: ");
        ladoCorto = sc.nextDouble();

        System.out.println("Introduzca el lado largo en metros: ");
        ladoLado = sc.nextDouble();

        // Calculamos el area para saber el tamaño.
        area = ladoCorto * ladoLado;

        // Calculamos el porcentaje idependientemente de cada zona.
        zonaAjardinada = area * 0.20;

        zonaEdificable = area * 0.80;

//        System.out.println("El area del edificable es: " + area);
//        System.out.println("El zona edificable es: " + zonaAjardinada);
//        System.out.println("El zona ajardinada es: " + zonaEdificable);

        // Calculamos el precio de la zona Ajardinada.
        precioFinalAjardinada = zonaAjardinada * 55;
        // Calculamos el precio de la zona Edificable.
        precioFinalEdificable = zonaEdificable * 100;

        // Sumamos las 2 zonas para saber el precio total.
        precioTotal = precioFinalEdificable + precioFinalAjardinada;

        // Hacemos un operador ternario para saber si supera los 150 m la zona edificable, si la supera hacemos un incremento del 10%
        // y si no pues dejamos el precio como estaba.
        incremento = zonaEdificable > 150 ? precioFinalEdificable * 1.10 : precioFinalEdificable;

        // Imprimimos los resultados en un solo syso con saltos de linea.
        System.out.println("El precio final para la zona ajardinada: " + precioFinalAjardinada + " \n"
                + "El precio final para la zona edificable: " + incremento + " \n" + "El precio final Total: "
                + precioTotal);

    }

}