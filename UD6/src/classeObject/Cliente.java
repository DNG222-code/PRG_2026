package classeObject;

import org.w3c.dom.ls.LSOutput;

public class Cliente extends Persona {

    public Cliente(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarDades() {
        super.mostrarDades();
        System.out.println("Soc Client");
    }

}