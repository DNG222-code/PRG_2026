package exercicis.activitat8pt3;

public class Equacion {

    // Atributos de la clase.
    private int a, b, c;

    // Constructor de la clase.
    public Equacion(int a, int b, int c) throws EquacionInvalidaExcepcion {
        // Mostramos el mensaje de error si el coeficiente (a) es 0.
        if (a == 0) {
            throw new EquacionInvalidaExcepcion("El coeficiente (a), no puede ser 0.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para resolver la ecuación.
    public String resolver() {
        // Formula del discriminante.
        double discriminante = (b * b) - (4 * a * c);

        // Comprobamos si tiene soluciones reales.
        if (discriminante > 0) {
            // Formula de las soluciones.
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            return "Dos soluciones: x1 = " + x1 + ", x2 = " + x2;
        }
        // Solo tiene una solución.
        else if (discriminante == 0) {
            double x = -b / (2.0 * a);

            return "Una solución: x = " + x;
        }
        else {
            return "No tiene soluciones reales.";
        }
    }

    // Sobreescribimos el toString para mostrar la clase.
    @Override
    public String toString() {
        return a + "x² + " + b + "x + " + c + " = 0";
    }
}
