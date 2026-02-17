package corregits.practica2;

public class Test {

    public static void main(String[] args) {

        Usuario u = new Usuario(
                UtilidadesScanner.ObtenerAtributoCadena("nombre"),
                UtilidadesScanner.ObtenerAtributoCadena("apellido"),
                UtilidadesScanner.ObtenerAtributoCadena("edad"));

        System.out.println(u);

        GestionFicheros.escribe(u, true);
    }
}
