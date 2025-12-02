package animales;

public class Perro extends Mamifero {

    private String nombre;

    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrar() {
        System.out.println("Guau");

    }

    @Override
    public void comer() {
        System.out.println(this.getNombre() + "Comiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}