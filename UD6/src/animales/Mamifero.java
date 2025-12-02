package animales;

public class Mamifero extends Animal {

    public Mamifero(String nombre) {
        super(nombre);
    }

    protected void amamantar() {
        System.out.println("Amamantando");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo");
    }

}