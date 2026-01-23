package activitat7pt3;

public class Futbolista implements Comparable<Futbolista> {
    // Atributos del futbolista
    String dni;
    String nombre;
    int edad;
    int numeroGoles;

    // Constructor
    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    // Método toString.
    public String toString() {
        return dni + "  " + nombre + "  " + edad + "  " + numeroGoles;
    }

    // Implementación de Comparable para definir el orden natural
    @Override
    public int compareTo(Futbolista o) {
        // Primero comparamos por NOMBRE
        int resultadoNombre = this.nombre.compareTo(o.nombre);

        // Si el resultado no es 0, significa que los nombres son diferentes
        if (resultadoNombre != 0) {
            return resultadoNombre;
        }

        // Si los nombres son iguales, comparamos por EDAD
        return Integer.compare(this.edad, o.edad);
    }

    // Método equals.
    @Override
    public boolean equals(Object o) {
        Futbolista f = (Futbolista) o;

        return f.dni.equals(this.dni);
    }
}
