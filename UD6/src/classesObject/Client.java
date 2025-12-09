package classesObject;

public class Client extends Persona {
    // Atrubuts.
    //

    // Constructors.
    public Client (String nom, int edat, double pes) {
        super(nom, edat, pes);
    }

    // Mètodes.
    @Override
    public void mostrarDades() {
        super.mostrarDades();
        System.out.println("Soc un client.");
    }

    // Getters & setters.
}