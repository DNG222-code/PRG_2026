package activitat6pt4;

public class Futbolista {

    // Declaramos los atributos.
    String nombre;
    int edad;
    int numero;

    // Generamos el constructor.
    public Futbolista(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return nombre + ": " + edad + " " + numero;
    }

    // Sobreescribimos el método de equals.
    @Override
    public boolean equals(Object o) {
        return this.nombre.equals(((Futbolista) o).nombre);
    }
}