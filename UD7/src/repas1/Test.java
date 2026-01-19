package repas1;

public class Test {

    public static void main(String[] args) {

        // Hacemos instancias de los objetos.
        Volable p = new Piloto("Ivan", 100);
        Mantenible tM = new TecnicoMantenimiento("Juan", 100);
        Aeronave aC = new AvionComercial("Boeing");

        // Mostramos los métodos heredados y de la propia clase.
        p.volar();
        tM.hacerMantenimiento();
        aC.mostrarInfo();

    }
}
