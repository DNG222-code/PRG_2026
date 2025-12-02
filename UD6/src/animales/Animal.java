package animales;

public class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.getNombre(nombre);
    }

    public void comer() {
        System.out.println("Comiendo...");
        System.out.println("Pienso");
    }

    public void getNombre(String nombre) {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}